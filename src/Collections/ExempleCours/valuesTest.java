package Collections.ExempleCours;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class valuesTest {
  public static void main(String[] args) {
    Map<Integer, String> map =new HashMap<Integer, String>();
    map.put(1,"un");
    map.put(2,"deux");
    map.put(3,"trois");
    map.put(4,"quatres");
    Collection<String> col = map.values();
    Iterator<String> itString = col.iterator();
    System.out.println("Parcours de la liste des valeurs d'une Map avec values : ");
    while (itString.hasNext()) {
      String value = itString.next();
      System.out.println("Valeur : " + value);
    }
  }
}
