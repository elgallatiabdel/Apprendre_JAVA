package Interfaces_graphique_swing.Teste_cours.Menus_barre;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
  final static int HAUTEUR = 200;
  final static int LARGEUR = 500;

  public MyFrame() {
    BarreEtat barreEtat = new BarreEtat(); // Ajout de l'initialisation
    setTitle("Ma première fenetre");
    setSize(LARGEUR, HAUTEUR);

    setJMenuBar(new MenuEditeur());
    this.getContentPane().setLayout(new BorderLayout(2,2));
    getContentPane().add(new BarreOutils(), "North");
    getContentPane().add(new ZoneGraphique(), "Center");
    getContentPane().add(barreEtat, "South");

    barreEtat.afficheCoord(0, 0);
    barreEtat.afficheInfo("Coordonnées du curseur: ");
    setVisible(true);
  }

  public static void main(String[] args) {
    new MyFrame();
  }
}
