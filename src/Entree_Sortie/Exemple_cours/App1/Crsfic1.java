package Entree_Sortie.Exemple_cours.App1;

import java.io.*;
import java.util.Scanner;
public class Crsfic1 {
  public static void main(String[] args) throws IOException {
    String nomfich ;
    int n;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("donnez le nom du fichier a crée: ");
      nomfich = scanner.nextLine();
      DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomfich));
      do {
        System.out.print("donner un entier: ");
        n = scanner.nextInt();
        if(n != 0) sortie.writeInt(n);
      } while(n != 0);
      sortie.close();
    }
    System.out.println("fin de création de fichier");
  }
}
