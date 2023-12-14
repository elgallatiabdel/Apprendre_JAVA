package Entree_Sortie.Exemple_cours.App2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Crftxt1 {
  public static void main(String[] args) throws IOException {
    String nomfich ;
    int n;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("donnez le nom du fichier a crée: ");
      nomfich = scanner.nextLine();
      PrintWriter sortie = new PrintWriter(new FileWriter(nomfich));
      do {
        System.out.print("donnez un entier: ");
        n = scanner.nextInt();
        if(n != 0) sortie.println(n + " a pour carré " + n*n);
      } while (n != 0);
      sortie.close();
    } 
    System.out.println("fin de création de fichier");
  }
}

