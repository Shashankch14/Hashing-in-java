/*

Subarrays with sum K
MediumAccuracy: 49.74%Submissions: 32K+Points: 4
Be the comment of the day in POTD and win a GfG T-Shirt!
Solve right now

banner
Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.


Example 1:

Input:
N = 5
Arr = {10 , 2, -2, -20, 10}
k = -10
Output: 3
Explaination: 
Subarrays: arr[0...3], arr[1...4], arr[3..4]
have sum exactly equal to -10.
*/



//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.findSubArraySum(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findSubArraySum(int arr[], int n, int k)
    {
        HashMap<Integer, Integer> mpp = new HashMap<>();
       // int maxLength = 0;
        int sum=0;
        int cnt=0;
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int target =sum-k;
            if(mpp.containsKey(target)){
                cnt+=mpp.get(target);
            }
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return cnt;
        // code here
    }
}
