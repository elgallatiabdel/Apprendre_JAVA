package Collections.apprendre;

import java.util.ArrayList;
import java.util.Vector;

public class Main5 {
  public static void main(String[] args) {
    Vector<Integer> vector = new Vector<Integer>();  // double la capacity // lent // thredad Safe
    ArrayList<Integer> arrayList = new ArrayList<Integer>(); // ajoute la moitié de la capacity // rapide // pas thread safe

    vector.add(10);
    vector.add(5);
    vector.add(15);
    vector.add(12);
    vector.add(10);
    vector.add(5);
    vector.add(15);
    vector.add(12);
    arrayList.add(10);
    arrayList.add(5);
    arrayList.add(15);
    arrayList.add(12);
    arrayList.add(10);
    arrayList.add(5);
    arrayList.add(15);
    arrayList.add(12);

    System.out.println("le contenue de vector: ");
    for(int v : vector) System.out.println(v);
    System.out.println("la capacité de vector : " +vector.capacity());
  }
}
