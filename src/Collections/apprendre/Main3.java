package Collections.apprendre;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main3 {
  public static void main(String[] args) {

    // la different entre HAshMap et LinkedHashMap et Treemap
    Map<String,Integer> notes1 = new HashMap<String,Integer>();
    Map<String,Integer> notes2 = new LinkedHashMap<String,Integer>();
    Map<String,Integer> notes3 = new TreeMap<String,Integer>();

    System.out.println("test de HashMAp:");
    testerMap(notes1);
    System.out.println("test de LinkedHashMap:");
    testerMap(notes2);
    System.out.println("test de TreeMap:");
    testerMap(notes3);

  }

  public static void testerMap (Map<String,Integer> map) {
    map.put("alawi", 13);
    map.put("karim", 10);
    map.put("abdelilah", 19);
    map.put("hamza", 16);
    map.put("mahdi", 17);

    for(String nom: map.keySet()) {
      int note = map.get(nom);
      System.out.println(nom + " : "+note);
    }
  }
}
