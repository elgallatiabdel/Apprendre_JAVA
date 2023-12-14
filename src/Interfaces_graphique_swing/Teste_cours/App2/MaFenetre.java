package Interfaces_graphique_swing.Teste_cours.App2;

import java.awt.event.MouseListener;  
import java.awt.event.MouseEvent;  

import javax.swing.JFrame;

public class MaFenetre extends JFrame implements MouseListener {
  public MaFenetre() {
    setTitle("Gestion de clics");
    setBounds(10,20,300,200);
    this.addMouseListener((MouseListener) this);
  }

  public void mouseClicked(MouseEvent ev) {
    int x = ev.getX();
    int y = ev.getY();
    System.out.println("clic au points de coordonnees " + x + ", " + y);
  }

  public void mousePressed(MouseEvent ev) {}
  public void mouseReleased(MouseEvent ev) {}
  public void mouseEntered(MouseEvent ev) {}
  public void mouseExited(MouseEvent ev) {}
}
