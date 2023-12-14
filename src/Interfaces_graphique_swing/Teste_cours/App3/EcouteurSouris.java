package Interfaces_graphique_swing.Teste_cours.App3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EcouteurSouris implements MouseListener {
  public void mouseClicked(MouseEvent ev) {
    int x = ev.getX();
    int y = ev.getY();
    System.out.println("clic au point de coordonnees " + x + ", "+ y);
  }

  public void mousePressed(MouseEvent ev) {}
  public void mouseReleased(MouseEvent ev) {}
  public void mouseEntered(MouseEvent ev) {}
  public void mouseExited(MouseEvent ev) {}
}