package Interfaces_graphique_swing.Teste_cours.Menus_barre;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BarreEtat extends JPanel {
  private JLabel coord, info;

  public BarreEtat() {
    this.setBackground(Color.darkGray);
    this.setLayout(new GridLayout(1,2));
    this.add(info = new JLabel());
    this.add(coord = new JLabel());
  }

  public void afficheCoord(int x, int y) {
    coord.setText("x: " + x + ", y: " + y);
  }

  public void afficheInfo(String message) {
    info.setText(message);
  }
}
