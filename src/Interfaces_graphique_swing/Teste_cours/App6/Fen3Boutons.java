package Interfaces_graphique_swing.Teste_cours.App6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fen3Boutons extends JFrame {
  private JButton monBouton1, monBouton2, monBouton3, monBouton4, monBouton5, monBouton6;

  public Fen3Boutons(){
    setTitle("Avec deux boutons");
    setSize(300, 200);

    monBouton1 = new JButton("Bouton A");
    monBouton2 = new JButton("Bouton B");

    monBouton3 = new JButton("Bouton C");
    monBouton4 = new JButton("Bouton D");

    monBouton5 = new JButton("Bouton E");
    monBouton6 = new JButton("Bouton F");

    Container contenue = getContentPane();
    contenue.setLayout(new FlowLayout());

    contenue.add(monBouton1);
    contenue.add(monBouton2);
    contenue.add(monBouton3);
    contenue.add(monBouton4);
    contenue.add(monBouton5);
    contenue.add(monBouton6);

    EcouteBouton1 ecout1 = new EcouteBouton1();
    EcouteBouton2 ecout2 = new EcouteBouton2();

    EcouteBouton ecout3 = new EcouteBouton(3);
    EcouteBouton ecout4 = new EcouteBouton(4);

    monBouton5.addActionListener( new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("action sur bouton E");
      }
    });

    monBouton6.addActionListener( new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("action sur bouton F");
      }
    });

    monBouton1.addActionListener(ecout1);
    monBouton2.addActionListener(ecout2);

    monBouton3.addActionListener(ecout3);
    monBouton4.addActionListener(ecout4);

    
  }
}
