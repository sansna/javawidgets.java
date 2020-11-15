/*
 * Author :  user
 * Date   :  2020 Nov 15 04:29:35 PM
 */
package src;

import java.util.*;

public class loops {
  public static void main(String[] args) {
    var s = new java.util.Scanner(System.in);
    while (true) {
      var b = s.next();
      if (b.equals("close")) {
        break;
      }
      System.out.println(b);
    }
    s.close();
  }
}
