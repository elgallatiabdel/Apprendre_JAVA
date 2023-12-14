package Interfaces_graphique_swing.Teste_cours.App3;

import javax.swing.JFrame;

public class MaFenetre extends JFrame {
  public MaFenetre() {
    setTitle("Gestion de clics");
    setBounds(10, 20, 300, 200);
    this.addMouseListener(new EcouteurSouris());
  }
}