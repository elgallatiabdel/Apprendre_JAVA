package Interfaces_graphique_swing.Teste_cours.Classes_Internes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre extends JFrame {
  private JLabel jlabel;
  private JButton jbutton;

  public Fenetre(){
    jlabel = new JLabel("Compteur");
    jbutton = new JButton("OK");
    this.getContentPane().add(jlabel,BorderLayout.NORTH);
    this.getContentPane().add(jbutton,BorderLayout.SOUTH);
    jbutton.addActionListener(new EcouteurClick());
  }

  public class EcouteurClick implements ActionListener {
    private int compteur;
    public EcouteurClick(){
      this.compteur = 0;
    }

    public void actionPerformed (ActionEvent e) {
      this.compteur++;
      Fenetre.this.jlabel.setText("Compteur = " + this.compteur);
    }

    public static void main(String[] args) {
      new Fenetre();
    }
  }
}
