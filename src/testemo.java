/*
 * Author :  user
 * Date   :  2020 Nov 15 11:45:59 PM
 */
import com.sansna.tests.*;
import java.util.*;

public class testemo {
  public static void main(String[] args) {
    var e = new emo();
    // public, modifiable
    e.name = "klsdjf";
    // protected
    // e.ver = "3.1";
    // package, not to mention private
    // e.nickname = "nick";
    System.out.println(e.getInfo());
  }
}
