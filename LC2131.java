// 2131. Longest Palindrome by Concatenating Two Letter Words

// You are given an array of strings words. Each element of words consists of two lowercase English letters.

// Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. Each element can be selected at most once.

// Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.

// A palindrome is a string that reads the same forward and backward.

 

// Example 1:

// Input: words = ["lc","cl","gg"]
// Output: 6
// Explanation: One longest palindrome is "lc" + "gg" + "cl" = "lcggcl", of length 6.
// Note that "clgglc" is another longest palindrome that can be created.


class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(int i =0;i<words.length;i++){
            mp.put(words[i], mp.getOrDefault(words[i],0)+1);
        }
        int maxLen=0;
        boolean checkMid =false;
        for(String word: mp.keySet()){
            char ch= word.charAt(0);
            char ch1= word.charAt(1);
            String rev=""+ch1+ch;
            if(word.equals(rev)){
                int pairs= mp.get(word)/2;
                maxLen += pairs*4;
                if(mp.get(word)%2==1){
                    checkMid=true;
                }

            }else if (mp.containsKey(rev)) {
                // Handle words that have a corresponding reversed word
                int pairs = Math.min(mp.get(word), mp.get(rev));
                maxLen += pairs * 4;
                mp.put(word, mp.get(word) - pairs);
                mp.put(rev, mp.get(rev) - pairs);
            }
        }

        // Add the middle palindromic word if available
        if (checkMid) {
            maxLen += 2;
        }

        return maxLen;
        

        
    }
}
