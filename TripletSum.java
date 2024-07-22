// Given an array arr of size n and an integer x. Find if there's a triplet in the array which sums up to the given integer x.

// Examples

// Input:n = 6, x = 13, arr[] = [1,4,45,6,10,8]
// Output: 1
// Explanation: The triplet {1, 4, 8} in the array sums up to 13.
// Input: n = 6, x = 10, arr[] = [1,2,4,3,6,7]
// Output: 1
// Explanation: Triplets {1,3,6} & {1,2,7} in the array sum to 10. 
// Input: n = 6, x = 24, arr[] = [40,20,10,3,6,7]
// Output: 0
// Explanation: There is no triplet with sum 24. 
// Expected Time Complexity: O(n2)
// Expected Auxiliary Space: O(1)

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int nums[], int n, int x) {

        // Your code Here
         for (int i = 0; i < nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            int currSum = x-nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                
                int third = currSum-nums[j];
                

              
                if (hashset.contains(third)) {
                   return true;

                }
                hashset.add(nums[j]);
            }
        }
        return false;
    }
}
