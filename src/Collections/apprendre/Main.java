package Collections.apprendre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // la different entre ArrayList et LinkedList
    List<Integer> aList = new ArrayList<Integer>();
    List<Integer> lList = new LinkedList<Integer>();
    List<Integer> aList2 = new ArrayList<Integer>();
    List<Integer> lList2 = new LinkedList<Integer>();
    long avantA, apresA, avantL, apresL, avantA2, apresA2, avantL2, apresL2;

    // si vous devez ajouter a la fin le pertinat est ArrayList
    avantA = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      aList.add(i);
    }
    apresA = System.currentTimeMillis();
    System.out.println("le temps passé est " + (apresA - avantA));

    avantL = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      lList.add(i);
    }
    apresL = System.currentTimeMillis();
    System.out.println("le temps passé est " + (apresL - avantL));

    System.out.println("autre methode:");

    // si vous devez ajouter au début ou au milieu le pertinat est LinkedList
    avantA2 = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      aList2.add(0, i);
    }
    apresA2 = System.currentTimeMillis();
    System.out.println("le temps passé est " + (apresA2 - avantA2));

    avantL2 = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      lList2.add(0, i);
    }
    apresL2 = System.currentTimeMillis();
    System.out.println("le temps passé est " + (apresL2 - avantL2));
  }
}
