package Entree_Sortie.Apprendre.App3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
  public static void main(String[] args) throws Exception {
    File f1 = new File(
        "C:/Users/k5641/OneDrive/Desktop/My_JAVA_Project/TestCours_Java/src/Entree_Sortie/Apprendre/App3/notes.txt");
    FileReader fr = new FileReader(f1);

    float somme = 0; 
    int nb = 0;
    try (BufferedReader br = new BufferedReader(fr)) {
      String s;
      while ((s = br.readLine()) != null) {
        System.out.println(s);
        ++nb;
        String[] t = s.split(";");
        float note = Float.parseFloat(t[2]);
        somme = somme + note;
      }
      System.out.println("la moyenne : " + (somme/nb));
    }
  }
}
