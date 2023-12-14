package Collections.ExempleCours;

import java.util.*;

public class KeySetTest {
  public static void main(String[] args) {
    Map<Integer, String> map =new HashMap<Integer, String>();
    map.put(1,"un");
    map.put(2,"deux");
    map.put(3,"trois");
    map.put(4,"quatres");
    Set<Integer> setInt = map.keySet();
    Iterator<Integer> it = setInt.iterator();
    System.out.println("Parcours d'une Map avec KeySet : ");
    while (it.hasNext()){
      int key = it.next();
      System.out.println("La clef "+key+" est associée à la valeur "+map.get(key));
    }
  }
}
