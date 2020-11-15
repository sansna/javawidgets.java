/*
 * Author :  user
 * Date   :  2020 Nov 15 09:02:19 PM
 */
package src;

import java.util.*;

public class array {
  public static void main(String[] args) {
    int a[], b, c[][];
    a = new int[] {1, 2, 34};
    b = 30;
    c = new int[][] {{1, 2, 3}, {3, 4, 5}, {9, 109}};
    // ??? array.toString() method seems not straight-forward.
    System.out.format("%s, %s, %d\n", a.hashCode(), a.toString(), b);
    // this is okay.
    System.out.println(Arrays.toString(a) + "\n" + Arrays.deepToString(c));

    // one can init like this.
    int d[] = new int[] {1, 2, 3}, e = 3, f[][] = {{10, 11}, {20,21}};
    System.out.println(Arrays.toString(d) + e + Arrays.deepToString(f));
  }
}
