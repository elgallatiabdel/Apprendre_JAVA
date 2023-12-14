package Interfaces_graphique_swing.Teste_cours.Menus_barre;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class BarreOutils extends JPanel {
  public BarreOutils(){
    String[] libilletCouleurs = {"Bleue","Rouge","Jaune","Vert"};
    this.setBackground(Color.lightGray);

    JComboBox<String> listeCouleurs = new JComboBox<String>();

    for(int i = 0; i < libilletCouleurs.length; i++) {
      listeCouleurs.addItem(libilletCouleurs[i]); // Correction de la faute de frappe ici
    }

    this.add(listeCouleurs);
    this.add(new JButton("Défaire"));
    this.add(new JButton("Tout effacer"));
    this.add(new JButton("Quitter"));
  }
}
