// Given an array arr, and an integer k, find the number of pairs of elements in the array whose sum is k.

// Examples:

// Input: k = 6, arr[] = [1, 5, 7, 1]
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.



class Solution {
    int getPairsCount(int[] arr, int sum) {
        // code here
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count=0;
        for(int num: arr){
            int target = sum - num;
            if(mp.containsKey(target)){
                count += mp.get(target);
                
            }
                mp.put(num, mp.getOrDefault(num,0)+1);
            
        }
        return count;
    }
}
