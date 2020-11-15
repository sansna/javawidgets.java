/*
 * Author :  user
 * Date   :  2020 Nov 15 04:48:40 PM
 */
package src;

import java.util.*;

public class classintro {
  private static int a;

  static {
    a = 100;
  }

  public classintro() {
    a = 20;
  }

  public static void main(String[] args) {
    System.out.println(a);
  }
}
