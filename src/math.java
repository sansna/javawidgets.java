/*
 * Author :  user
 * Date   :  2020 Nov 15 08:21:48 PM
 */
package src;

import java.util.*;

public class math {
  public static void main(String[] args) {
    // now a is of type int.
    var a = 100 / 8;
    System.out.println(a);
    // now b is of type double.
    var b = 100D / 8;
    System.out.println(b);
    // print concat
    System.out.println("result=" + b);

    // java precision check
    double addup = 0;
    for (int i = 0; i < 100; i++) {
      addup += 0.01D;
    }
    System.out.println("addup: " + addup);

    // this prints -1, truncate the fp part.
    int truncateDiv = -3;
    System.out.println("truncateDiv: " + truncateDiv / 2);
    // this prints -2, down to nearest int.
    System.out.println("ceilDiv: " + Math.floorDiv(truncateDiv, 2));

    // returns arc angle of ptr (y,x)
    var r = Math.atan2(0, -1);
    System.out.println(r);
  }
}
