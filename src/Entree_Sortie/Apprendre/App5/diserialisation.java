package Entree_Sortie.Apprendre.App5;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class diserialisation {
  public static void main(String[] args) throws Exception {
    File f = new File("C:/Users/k5641/OneDrive/Desktop/My_JAVA_Project/TestCours_Java/src/Entree_Sortie/Apprendre/App5/eco.txt");
    FileInputStream fis = new FileInputStream(f);

    
    ObjectInputStream ois = new ObjectInputStream(fis);
    Etudiant e1 = (Etudiant) ois.readObject();
    Etudiant e2 = (Etudiant) ois.readObject();

    System.out.println(e1);
    System.out.println(e2);
  }
}
