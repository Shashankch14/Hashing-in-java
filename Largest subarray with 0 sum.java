/*
Largest subarray with 0 sum
MediumAccuracy: 41.84%Submissions: 286K+Points: 4
Be the comment of the day in POTD and win a GfG T-Shirt!
Solve right now

banner
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
*/
class GfG
{
    int maxLen(int arr[], int n)
    {
         HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < n; i++) {
            cumulativeSum += arr[i];

            // If cumulative sum is 0, update maxLength
            if (cumulativeSum == 0) {
                maxLength = i + 1;
            }

            // If cumulative sum is already seen, update maxLength
            if (map.containsKey(cumulativeSum)) {
                maxLength = Math.max(maxLength, i - map.get(cumulativeSum));
            } else {
                // Store the first occurrence of cumulative sum
                map.put(cumulativeSum, i);
            }
        }

        return maxLength;
        // Your code here
    }
}
