// Maximum difference Indexes
// Difficulty: EasyAccuracy: 42.79%Submissions: 6K+Points: 2
// Given an array A[]of size N. Let us call difference between indices of an element's first and last appearance in the array A[] a gap. Find the maximum possible gap.  Note that if any element appears only once, then the gap for that element is 0.
 

// Example 1:

// Input:
// N = 9
// A[] = {2, 1, 3, 4, 2, 1, 5, 1, 7}
// Output:
// 6
// Explanation:
// For the above test case (Assuming 0-based indexing): 
// Number 1's first appearance is at index 1 and last appearance is at index 7. This implies gap is 7-1=6
// This is the maximum possible in the given test case.GFG_Maximum difference Indexes

class Solution
{
	public int maxDiffIndex(int A[], int N)
	{
	    int maxDiff=0;
	    HashMap<Integer, Integer> mp = new HashMap<>();
	    for(int i=0;i<N;i++){
	        int currDiff=0;
	        if(mp.containsKey(A[i])){
	            int start = mp.get(A[i]);
	            currDiff=i-start;
	        }else{
	            mp.put(A[i],i);
	        }
	        maxDiff=Math.max(maxDiff,currDiff);
	        
	    }
	    return maxDiff;
	    
	}
}
