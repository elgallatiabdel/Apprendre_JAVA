package Collections.ExempleCours;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
  public static void main(String[] args) {
    Set<String> tree = new TreeSet<String>();
    tree.add("John");
    tree.add("Nadia");
    tree.add("Abdelilah");
    tree.add("Badre");
    Iterator<String> it = tree.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
