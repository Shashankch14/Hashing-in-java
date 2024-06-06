/*
We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.

Example Testcase:-

Arr = [3, 2, 3, 2, 4, 3]

Frequencies of Elements of Array are:-

3 - 3
2 - 2
4 - 1

Maximum Frequency:- Element is 3, Frequency is 3
Minimum Frequency:- Element is 4, Frequency is 1


*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 2, 3, 2, 4, 3};
        int maxiFreq = Integer.MIN_VALUE, maxiElement = arr[0];
        int miniFreq = Integer.MAX_VALUE, miniElement = arr[0];

        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i =0;i<n;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue()>maxiFreq){
                maxiFreq = e.getValue();
                maxiElement=e.getKey();
            }
            if(e.getValue()<miniFreq){
                miniFreq = e.getValue();
                miniElement=e.getKey();
            }
        }
        System.out.println("Max frequency element: " + maxiElement + " with frequency: " + maxiFreq);
        System.out.println("Min frequency element: " + miniElement + " with frequency: " + miniFreq);
    }
}
