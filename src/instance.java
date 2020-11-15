/*
 * Author :  user
 * Date   :  2020 Nov 15 09:41:29 PM
 */
package src;

import java.util.*;

public class instance {
  public static void main(String[] args) {
    Map<Object, Object> map = new HashMap();
    // hashmap is Object.
    boolean isObj = map instanceof Object;
    boolean isHMap = map instanceof HashMap;
    System.out.println(isObj);
	System.out.println(isHMap);
  }
}
