/* 
Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

x if x >= 0.
-x if x < 0.


approach:
We need to check two target values because the absolute difference |nums[i] - nums[j]| can be either nums[i] - nums[j] or nums[j] - nums[i], which translates to nums[i] + k or nums[i] - k. Here is why:

Case 1: nums[i] - nums[j] = k

This can be rewritten as nums[i] = nums[j] + k, so we need to check if nums[j] + k (i.e., nums[i] + k) exists in the map.
Case 2: nums[j] - nums[i] = k

This can be rewritten as nums[i] = nums[j] - k, so we need to check if nums[j] - k (i.e., nums[i] - k) exists in the map.
*/
class Solution {
    public int countKDifference(int[] nums, int k) {
       Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i] + k;
            int num2 = nums[i] - k;

            // Check if nums[i] + k exists in the map
            if (mp.containsKey(num1)) {
                count += mp.get(num1);
            }
            
            // Check if nums[i] - k exists in the map
            if (mp.containsKey(num2)) {
                count += mp.get(num2);
            }

            // Update the map with the current number
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        
        return count;


    }
}
