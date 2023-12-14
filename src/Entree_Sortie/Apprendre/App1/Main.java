package Entree_Sortie.Apprendre.App1;

import java.io.File;

public class Main {
  public static void main(String[] args) {
    File f = new File("c:/");
    String[] contenue = f.list();
    for(String s : contenue) {
      File f2 = new File("c:/" + s);
      if(f2.isDirectory()) System.out.println("Rep : "+ s);
      else System.out.println("File : "+s);
    }
  }
}
