// Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:

// 0 <= i, j, k, l < n
// nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 

// Example 1:

// Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
// Output: 2
// Explanation:
// The two tuples are:
// 1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
// 2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    int count = 0;
    // for (int i = 0; i < nums1.length; i++) {
    //     for (int j = 0; j < nums2.length; j++) {
    //         for (int k = 0; k < nums3.length; k++) {
    //             for (int l = 0; l < nums4.length; l++) {
    //                 if (nums1[i] + nums2[j] + nums3[k] + nums4           l] == 0) {
    //                     count++;
    //                 }
    //             }
    //         }
    //     }
    // }
    HashMap<Integer,Integer> mp = new HashMap<>();
    for(int n1: nums1){
        for(int n2:nums2){
            int sum = n1+n2;
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
    }
    for(int n3:nums3){
        for(int n4:nums4){
            int sum =n3+n4;
            if(mp.containsKey(-sum)){
                count+=mp.get(-sum);
            }
        }
    }
    return count;
    }
}
