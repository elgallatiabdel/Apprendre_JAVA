package Entree_Sortie.Apprendre.App5;

import java.io.ByteArrayOutputStream;
// import java.io.File;
// import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialisation {
  public static void main(String[] args) throws Exception {
    Etudiant e1 = new Etudiant("E1", "Math", 15);
    Etudiant e2 = new Etudiant("E2", "Math", 13);

    // File f = new File("C:/Users/k5641/OneDrive/Desktop/My_JAVA_Project/TestCours_Java/src/Entree_Sortie/Apprendre/App5/eco.txt");
    // FileOutputStream fos = new FileOutputStream(f);
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(e1);
    oos.writeObject(e2);
    byte[] t = bos.toByteArray();
    System.out.println(t.length);
    oos.close();
  }
}
