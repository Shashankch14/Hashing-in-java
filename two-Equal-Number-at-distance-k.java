/*
Check if there are any two Equal numbers in an array at a distance less than or equal to k
Optimised Approach:- Instead of Running 2 Nested For loops, 
we will create a Hashmap to Store the Occurences of the Elements which we have encountered in the past.
At each index i, we will calculate the Required Element, = (arr[i]+k),
we wil check if it is present in hashmap, we will do cnt = cnt + freq[requiredElement]. 
We will update the frequency for current element in hashmap.

*/

import java.util.HashMap;

public class EqualNumbersWithinDistance {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // Update the latest index of the element
        }

        return false;
    }

    public static void main(String[] args) {
        // Test the function with an example
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k)); // Output: false

        k = 3;
        System.out.println(containsNearbyDuplicate(nums, k)); // Output: true
    }
}
