// qs - https://leetcode.com/discuss/interview-question/3114099/AMAZON-OA-(INTERN-2024)

/*package whatever //do not write package name here */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GFG {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        Map<Character, Integer> freq_s = new HashMap<>();
        Map<Character, Integer> freq_t = new HashMap<>();

        for (char letter : s.toCharArray()) {
            freq_s.put(letter, freq_s.getOrDefault(letter, 0) + 1);
        }
        for (char letter : t.toCharArray()) {
            freq_t.put(letter, freq_t.getOrDefault(letter, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;

        for (char letter : t.toCharArray()) {
            ans = Math.min(freq_s.getOrDefault(letter, 0) / freq_t.getOrDefault(letter, 0), ans);
        }

        System.out.println(ans);
    }

}



