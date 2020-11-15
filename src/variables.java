/*
 * Author :  user
 * Date   :  2020 Nov 15 07:33:16 PM
 */
package src;

import java.util.*;

public class variables {
  public static int a;
  public static byte b;
  public static short c;
  public static char d;
  public static long e;
  public static float fl;
  public static double g;
  public static boolean h;

  // The Uppercase variables is immutable once set, but you can point it to another immutable space
  // of diff value.
  public static Integer aa = Integer.valueOf(123);

  static {
    a = 1;
    b = 'z';
    c = 8;
    d = 'x';
    e = 12391231;
    fl = 1.2f;
    g = 12.3;
    h = false;

    // aa = 12;
  }

  public void Var() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(fl);
    System.out.println(g);
    System.out.println(h);
    System.out.println(aa);
  }

  public static void ChangeVal(Float fl, Integer aa) {
    fl = 3.1415f;
    aa = Integer.valueOf(87);
  }

  public static void main(String[] args) {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(fl);
    System.out.println(g);
    System.out.println(aa);
    ChangeVal(fl, aa);
    System.out.println(fl);
    System.out.println(h);
    System.out.println(aa);
    aa = null;
    // The following result to a NullException.
    // a = aa;
    System.out.println(aa);
    System.out.println(a);
  }
}
