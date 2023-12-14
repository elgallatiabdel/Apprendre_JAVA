package Interfaces_graphique_swing.Teste_cours.App5;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fen2Butons extends JFrame implements ActionListener {
  private JButton monBouton1, monBouton2;

  public Fen2Butons() {
    setTitle("Avec deux butons");
    setSize(300,200);
    monBouton1 = new JButton("Bouton  A");
    monBouton2 = new JButton("Bouton  B");
    monBouton1.setBackground(Color.WHITE );
    monBouton2.setBackground(Color.YELLOW );

    Container contenue = getContentPane();
    contenue.setLayout(new FlowLayout());

    contenue.add(monBouton1);
    contenue.add(monBouton2);

    monBouton1.addActionListener(this);
    monBouton2.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == monBouton1 )
      System.out.println("action sur bouton numéro 1");
    if(e.getSource() == monBouton2 )
      System.out.println("action sur bouton numéro 2");

    String nom = e.getActionCommand();
    System.out.println("Action sur bouton " + nom);
  }
}
