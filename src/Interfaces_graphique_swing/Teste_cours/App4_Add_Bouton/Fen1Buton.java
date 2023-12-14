package Interfaces_graphique_swing.Teste_cours.App4_Add_Bouton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fen1Buton extends JFrame implements ActionListener {
  private JButton monBouton;

  public Fen1Buton() {
    setTitle("Premier bouton");
    setSize(300, 200);
    monBouton = new JButton("Clickcer sur moi!!");
    getContentPane().setLayout(new FlowLayout());
    getContentPane().add(monBouton);
    monBouton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("action sur boutton 'Clickcer sur moi!!'");
  }
}
