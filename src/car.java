/*
 * Author :  user
 * Date   :  2020 Nov 15 10:28:39 PM
 */
package src;

import java.util.*;

public class car {
	// private (same class)
	// package (default, same package)
	// protected (same package + subclasses)
	// public (no restriction)
  public String brand = null;
  public String model = null;
  public String color = null;

  public car() {}

  public car(String b, String m, String c) {
    this.brand = b;
    this.model = m;
    this.color = c;
  }

  public String getCarinfo() {
    String out = "";
    if (this.brand != null) {
      out += this.brand;
    }
    if (this.model != null) {
      out += this.model;
    }
    if (this.color != null) {
      out += this.color;
    }
    // this way prints null.
    // out = this.brand + this.model + this.color;
    return out;
  }

  public static void main(String args[]) {
    var c = new car();
    System.out.println(c.getCarinfo());
    var cc = new car("zz", "xx", "red");
    cc.brand = "hello";
    cc.model = "zxcvll";
    System.out.println(cc.getCarinfo());
  }
}
