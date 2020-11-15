/*
 * Author :  user
 * Date   :  2020 Nov 15 11:39:20 PM
 */
package com.sansna.tests;

import java.util.*;

public class emo {
  private String val = "internal";
  String nickname = "sansna";
  protected String ver = "0.1";
  public String name = "zz";

  public emo() {}

  public emo(String val, String nick, String ver, String name) {
    this.val = val;
    this.nickname = nick;
    this.ver = ver;
    this.name = name;
  }

  public String getInfo() {
    return this.val + this.nickname + this.ver + this.name;
  }

  public static void main(String[] args) {
    var s = new emo();
    System.out.println(s.getInfo());
    var ss = new emo("changed", "Sansna", "0.2", "xx");
    System.out.println(ss.getInfo());
  }
}
