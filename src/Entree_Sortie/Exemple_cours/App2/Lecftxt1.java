package Entree_Sortie.Exemple_cours.App2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lecftxt1 {
  public static void main(String[] args) throws IOException {
    String nomfich ;
    String ligne;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("donnez le nom du fichier a lister: ");
      nomfich = scanner.nextLine();
      BufferedReader entree = new BufferedReader(new FileReader(nomfich));
      do {
        ligne = entree.readLine();
        if(ligne != null) System.out.println(ligne);
      } while(ligne != null);
      entree.close();
    } 
    System.out.println("fin liste de fichier");
  }
}