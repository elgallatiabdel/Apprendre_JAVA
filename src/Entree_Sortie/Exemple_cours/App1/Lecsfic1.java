package Entree_Sortie.Exemple_cours.App1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lecsfic1 {
  public static void main(String[] args) throws IOException {
    String nomfich;
    int n = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("donner le nom de fichier a lister: ");
      nomfich = scanner.nextLine();
    }

    DataInputStream entree = new DataInputStream(new FileInputStream(nomfich));
    System.out.println("Valeurs lues dans le fichier " + nomfich + " : ");
    boolean eof = false; // sera mis true par exception EOFile
    while (!eof) {
      try {
        n = entree.readInt();
      } catch (EOFException e) {
        eof = true;
      }
      if(!eof) System.out.println(n);
    }
    entree.close();
    System.out.println("fin liste fichier");
  }
}
