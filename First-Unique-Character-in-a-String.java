/*
First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
*/
class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            
        }
        for(int i =0;i<s.length();i++){
            if(mp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
        
    }
}
