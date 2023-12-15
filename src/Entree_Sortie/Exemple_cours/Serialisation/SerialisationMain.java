package Entree_Sortie.Exemple_cours.Serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationMain {
  public static void main(String[] args) {
    try {
      // creation de personne
      Personne p = new Personne("Elgallati", "Mahdi",21);
      System.out.println("creation de : " + p);

      // ouverture d'un flux de sortie vers le fichier "personne.serial"
      FileOutputStream fos = new FileOutputStream("personne.serial");

      // création d'un "flux objet" avec le flux fichier
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      try {
        // sérialisation : ecriture de l'oblet dans le flux de sortie
        oos.writeObject(p);

        // on vide le tampon
        oos.flush();
        System.out.println(p + " a été sérilaiser");
      } finally {
        try {
          oos.close();
        } finally {
          fos.close();
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
