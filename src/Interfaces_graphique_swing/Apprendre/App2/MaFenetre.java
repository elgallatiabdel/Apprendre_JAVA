package Interfaces_graphique_swing.Apprendre.App2;

import javax.swing.*;
import java.awt.event.*;

class MaFenetre extends JFrame implements MouseListener {
  public MaFenetre() {
    setTitle("Gestion de clics");
    setBounds(10, 20, 300, 200);
    addMouseListener(this);
  }

  public void mouseClicked ( MouseEvent ev) {
  System.out.println ("clic dans fenetre") ;
  }

  public void mousePressed(MouseEvent ev) {
    System.out.println("mousePressed");
  }

  public void mouseReleased(MouseEvent ev) {
  }

  public void mouseEntered(MouseEvent ev) {
    System.out.println("mouseEntered");
  }

  public void mouseExited(MouseEvent ev) {
  }
}
