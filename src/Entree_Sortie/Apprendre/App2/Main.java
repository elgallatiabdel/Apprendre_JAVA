package Entree_Sortie.Apprendre.App2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File f1 = new File(
                    "C:/Users/k5641/OneDrive/Desktop/My_JAVA_Project/TestCours_Java/src/Entree_Sortie/Apprendre/App2/notes.txt");
            FileReader fr = new FileReader(f1);
            File f2 = new File(
                    "C:/Users/k5641/OneDrive/Desktop/My_JAVA_Project/TestCours_Java/src/Entree_Sortie/Apprendre/App2/copie.txt");
            FileWriter fw = new FileWriter(f2);

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            fw.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
