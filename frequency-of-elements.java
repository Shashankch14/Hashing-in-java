
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 9;
        int[] a = {1, 3, 3, 4, 1, 4, 4, 4, 4};
        int[] b = new int[10];
        int i = 0;
        while (i < n) {
            int x = a[i];
            b[x]++;
            i++;
        }
        // Above for loop took O(n) time.
        // All frequencies have been calculated in advance by now.. :-) :-)

        int[] queries = {3, 4, 1};
        int q = 3;
        int j = 0;
        while (j < q) {
            int x = queries[j];
            System.out.print(b[x]); // takes O(1) time..
            System.out.print(' ');
            j++;
        }
        // Above for loop took O(q) time.

        // Hence total time: O(n+q).
    }
}
