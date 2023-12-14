package Collections.ExempleCours;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class entrySetTest {
  public static void main(String[] args) {
    Map<Integer, String> map =new HashMap<Integer, String>();
    map.put(1,"un");
    map.put(2,"deux");
    map.put(3,"trois");
    map.put(4,"quatres");
    Set<Entry<Integer, String>> setEntry = map.entrySet();
    Iterator<Entry<Integer, String>> itEntry = setEntry.iterator();
    System.out.println("Parcours d'une Map avec setEntry : ");
    while (itEntry.hasNext()) {
      Entry<Integer, String> entry = itEntry.next();
      System.out.println("Valeur pour la clé " + entry.getKey() + " = " + entry.getValue());
    }
  }
}
