package Interfaces_graphique_swing.Teste_cours.App7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenLabel extends JFrame implements ActionListener {

  private JButton bouton;
  private JLabel compte;
  private int nbClics; 

  public FenLabel() {
    setTitle("Essais Etiquetes");
    setSize(300,120);
    Container contenue = getContentPane();
    contenue.setLayout(new FlowLayout());

    bouton = new JButton("COMPTEUR");
    bouton.addActionListener(this);
    contenue.add(bouton);

    nbClics = 0;

    compte = new JLabel("nombre de clics sur un Compteur = " + nbClics);
    contenue.add(compte);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    nbClics++;
    compte.setText("nombre de clics sur un Compteur = " + nbClics);
  }
  
}
