package Interfaces_graphique_swing.Teste_cours.Menus_barre;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuEditeur extends JMenuBar {
  public MenuEditeur() {
    JMenu menuFichier = new JMenu("Fichier");
    JMenuItem itemNouveau = new JMenuItem("Nouveau");
    JMenuItem itemOuvrir = new JMenuItem("Ouvrir");
    JMenuItem itemEnregistrer = new JMenuItem("Enregistrer");
    JMenuItem itemQuitter = new JMenuItem("Quitter");

    menuFichier.add(itemNouveau);
    menuFichier.add(itemOuvrir);
    menuFichier.add(itemEnregistrer);
    menuFichier.add(itemQuitter);

    add(menuFichier);
  }
}
