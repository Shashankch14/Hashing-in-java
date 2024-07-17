

// Given an array arr[] of N integers. The task is to find the sum of the elements which have frequencies greater than or equal to that element in the array.

// Examples: 

// Input: arr[] = {2, 1, 1, 2, 1, 6}
// Output: 3
// The elements in the array are {2, 1, 6}
// Where,
//  2 appear 2 times which is greater than equal to 2 itself.
//  1 appear 3 times which is greater than 1 itself.
//  But 6 appears 1 time which is not greater than or equals to 6.
// So, sum = 2 + 1 = 3.

// Input: arr[] = {1, 2, 3, 3, 2, 3, 2, 3, 3}
// Output: 6
import java.util.HashMap;

public class Solution {
    public static int sumElementsWithFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        // Sum the elements which have frequencies greater than or equal to the element
        for (int num : arr) {
            if (frequencyMap.get(num) >= num) {
                sum += num;
                // Set frequency to a negative value to avoid adding the same element multiple times
                frequencyMap.put(num, -1);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 1, 2, 1, 6};
        System.out.println(sumElementsWithFrequency(arr1));  // Output: 3

        int[] arr2 = {1, 2, 3, 3, 2, 3, 2, 3, 3};
        System.out.println(sumElementsWithFrequency(arr2));  // Output: 6
    }
}
