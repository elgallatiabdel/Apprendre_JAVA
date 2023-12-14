package Collections.apprendre;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
  public static void main(String[] args) {
    Map<String,Integer> notes = new HashMap<String,Integer>();
    Map<String,Integer> notes2 = new HashMap<String,Integer>();

    // les testes de Map et HashMap
    // la repetition de key est interdit dans le HashMAp
    notes.put("Alawi", 18);
    notes.put("karim", 15);
    notes.put("abdelilah", 19);
    notes.put("hamza", 16);
    notes.put("mahdi", 17);
    System.out.println("le contenue de notes: ");
    System.out.println(notes);
    System.out.println("les informations de abdelilah: ");
    System.out.println(notes.get("abdelilah"));
    System.out.println("la clé mahdi existe dans le tableau notes: ");
    System.out.println(notes.containsKey("mahdi"));
    System.out.println("Suppression de hamza: ");
    notes.remove("hamza");
    System.out.println("le contenue de notes: ");
    System.out.println(notes);
    System.out.println("la taille de notes: ");
    System.out.println(notes.size());
    System.out.println("notes est vide? ");
    System.out.println(notes.isEmpty());
    System.out.println("les values de notes: ");
    System.out.println(notes.values());
    System.out.println("les clé de notes: ");
    System.out.println(notes.keySet());

    notes2.put("salma", 13);
    notes2.put("khadija", 14);
    System.out.println("le contenue de notes 2: ");
    System.out.println(notes2);
    System.out.println("poser tout le contenue de notes 2 dans notes: ");
    notes.putAll(notes2);
    System.out.println("le contenue de notes: ");
    System.out.println(notes);

    System.out.println("le contenue de notes avec une boucle for: ");
    for(Map.Entry<String,Integer> e : notes.entrySet()){
      String nom = e.getKey();
      int note = e.getValue();
      System.out.println(nom +" : "+ note);
    }
    notes.clear();
  }
}
