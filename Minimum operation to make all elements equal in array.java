// Given an array with n positive integers. We need to find the minimum number of operations to make all elements equal. 
// We can perform addition, multiplication, subtraction, or division with any part on an array element. 

// To solve the problem of finding the minimum number of operations to make all elements in an array equal, we can follow these steps:

// Identify the target element: Since we can perform any operation to any element, the optimal approach is to make all elements equal to the most frequent element in the array. This will minimize the number of operations needed.
// Count the frequency of each element: Use a HashMap to count the frequency of each element.
// Determine the maximum frequency: Find the element with the highest frequency.
// Calculate the minimum operations: The minimum number of operations needed will be the total number of elements minus the maximum frequency.
// Let's implement this in Java:



import java.util.HashMap;

public class MinimumOperations {
    public static int minOperationsToMakeElementsEqual(int[] arr) {
        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // The minimum operations needed to make all elements equal
        return arr.length - maxFrequency;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        System.out.println(minOperationsToMakeElementsEqual(arr1)); // Output: 3

        int[] arr2 = {1, 1, 1, 1};
        System.out.println(minOperationsToMakeElementsEqual(arr2)); // Output: 0

        int[] arr3 = {1, 2, 2, 2, 3, 3};
        System.out.println(minOperationsToMakeElementsEqual(arr3)); // Output: 3

        int[] arr4 = {1, 1, 2, 2, 3};
        System.out.println(minOperationsToMakeElementsEqual(arr4)); // Output: 3

        int[] arr5 = {5, 5, 5, 10, 10, 20};
        System.out.println(minOperationsToMakeElementsEqual(arr5)); // Output: 3

        int[] arr6 = {7, 7, 7, 7, 7};
        System.out.println(minOperationsToMakeElementsEqual(arr6)); // Output: 0
    }
}
