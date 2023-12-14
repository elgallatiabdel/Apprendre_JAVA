package Collections.ExempleCours;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      String str = (String)it.next();
      System.out.println(str);
    }
    System.out.println("-----------------");
    System.out.println("remove '2' et '4'");
    it = list.iterator();
    while (it.hasNext()) {
      String str = (String)it.next();
      if(str.equals("4") || str.equals("2")) it.remove();
    }
    System.out.println("-----------------");
    it = list.iterator();
    while (it.hasNext()) {
      String str = (String)it.next();
      System.out.println(str);
    }
  }
}
