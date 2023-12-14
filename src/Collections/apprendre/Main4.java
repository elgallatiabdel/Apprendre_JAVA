package Collections.apprendre;

import java.util.HashSet;
import java.util.Set;

public class Main4 {
  public static void main(String[] args) {
    Set<String> biblio = new HashSet<String>();
    Set<String> mesLivre = new HashSet<String>();
    if(biblio.isEmpty()) System.out.println("mon set est vide");
    biblio.add("sahih boukhari");
    biblio.add("abu dawud");
    biblio.add("ibn maajid");
    biblio.add("malik");
    biblio.add("muslim");
    System.out.println(biblio);

    mesLivre.add("sahih");
    mesLivre.add("abu dawud");
    mesLivre.add("ibn maajid");
    mesLivre.add("malik");
    for(String livre : biblio) {
      System.out.println(livre);
    }

    if(biblio.contains("muslim")) System.out.println("le livre existe dans la bibliotéque");
    if(biblio.containsAll(mesLivre)) System.out.println("la biblio conteint tout les livres que tu possède");

    System.out.println(mesLivre);
    // mesLivre.retainAll(biblio);
    // System.out.println(mesLivre);
    mesLivre.removeAll(biblio);
    System.out.println(mesLivre);
  }
}
