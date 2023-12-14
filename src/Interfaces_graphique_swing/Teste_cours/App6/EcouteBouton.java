package Interfaces_graphique_swing.Teste_cours.App6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteBouton implements ActionListener {
  private int n;

  public EcouteBouton(int n) {
    this.n = n;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(n == 3) {
      System.out.println("action sur bouton C");
    } else if(n == 4) {
      System.out.println("action sur bouton D");
    }
  }
}
