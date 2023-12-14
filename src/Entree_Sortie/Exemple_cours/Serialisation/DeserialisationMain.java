package Entree_Sortie.Exemple_cours.Serialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialisationMain {
  public static void main(String[] args) {
    Personne p = null;
    try {
      // ouverture d'un flux d'entrée depuis le fichier "personne.serial"
      FileInputStream fis = new FileInputStream("personne.serial");

      // création d'un "flux objet" avec le flux fichier
      ObjectInputStream ois = new ObjectInputStream(fis);
      try {
        // déserialisation : lecture de l'objet depuis le flux d'entrée
        p = (Personne) ois.readObject();
      } finally {
        try {
          ois.close();
        } finally {
          fis.close();
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    if(p != null) {
      System.out.println(p + " a été deserialiser");
    }
  }
}