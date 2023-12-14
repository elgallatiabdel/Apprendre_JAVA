package Exceptions.Apprendre.Essay;

import java.util.*;

public class App {
  public static void main(String[] args) {

    // methode 1
    // int age;
    // Scanner sc = new Scanner(System.in);
    // try {
    // System.out.print("Année de naissance : ");
    // age = Integer.parseInt(sc.nextLine());
    // } catch (Exception e) {
    // System.err.print("Erreur de saisie, veuillez entrer l'année de naissance :
    // ");
    // age = Integer.parseInt(sc.nextLine());
    // }
    // System.out.println("votre age est " + age);

    try (// methode 2
    Scanner sc = new Scanner(System.in)) {
      try {
        System.out.print("Année de naissance : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("votre age est " + age);

      } catch (Exception e) {
        System.err.println("La date de naissance est invalide");
      }
    }
  }
}
