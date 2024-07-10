// 1248. Count Number of Nice Subarrays

// Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

// Return the number of nice sub-arrays.

 

// Example 1:

// Input: nums = [1,1,2,1,1], k = 3
// Output: 2
// Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
// Example 2:

// Input: nums = [2,4,6], k = 1
// Output: 0
// Explanation: There are no odd numbers in the array.
// Example 3:

// Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
// Output: 16

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

Certainly! In Java, we can use a HashMap to keep track of the count of odd numbers encountered so far as we iterate through the array. Here’s how you can implement the solution using a HashMap approach:

java
Copy code
import java.util.HashMap;

public class CountNiceSubarrays {
    public static int countNiceSubarrays(int[] nums, int k) {
        // HashMap to count occurrences of odd counts encountered
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); // Initialize with 0 odd counts encountered once
        
        int count = 0;
        int oddCount = 0;
        
        for (int num : nums) {
            if (num % 2 == 1) {
                oddCount++;
            }
            
            // If we have seen oddCount - k before, those subarrays are valid
            if (countMap.containsKey(oddCount - k)) {
                count += countMap.get(oddCount - k);
            }
            
            // Update the countMap with the current oddCount
            countMap.put(oddCount, countMap.getOrDefault(oddCount, 0) + 1);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(countNiceSubarrays(nums, k)); // Output: 2
    }
}
// Explanation:

// HashMap countMap: This map is used to keep track of the number of times each odd count (oddCount) has been encountered as we iterate through the array nums.
// Initialization: We start by initializing countMap with {0: 1}, which means we have encountered 0 odd numbers exactly once initially.
// Iterating through nums: For each number in nums:
// If the number is odd (num % 2 == 1), increment oddCount.
// Check if countMap contains oddCount - k. If it does, it means there are subarrays ending at the current index with exactly k odd numbers.
// Update count by adding the value from countMap corresponding to oddCount - k.
// Update countMap by incrementing the count of oddCount.
// Return count: After iterating through the array, count will contain the total number of "nice" subarrays.
// This solution efficiently counts the number of subarrays with exactly k odd numbers using a HashMap to track occurrences of each possible oddCount


class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); // Initialize with 0 odd counts encountered once
        
        int count = 0;
        int oddCount = 0;
        
        for (int num : nums) {
            if (num % 2 == 1) {
                oddCount++;
            }
            
            // If we have seen oddCount - k before, those subarrays are valid
            if (countMap.containsKey(oddCount - k)) {
                count += countMap.get(oddCount - k);
            }
            
            // Update the countMap with the current oddCount
            countMap.put(oddCount, countMap.getOrDefault(oddCount, 0) + 1);
        }
        
        return count;
        
    }
}
