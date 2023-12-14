package Socket.TP.Messagerie;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame {
  private JButton btnConnexion, btnInscription;
  private JLabel sujet;

  public Home() {
    setTitle("Messages");
    setSize(700, 300);

    sujet = new JLabel("Sujets :");
    btnConnexion = new JButton("Identification");
    btnInscription = new JButton("Inscription");

    

    Container contenue = getContentPane();
    contenue.setLayout(new FlowLayout());

    contenue.add(sujet);
    contenue.add(btnConnexion);
    contenue.add(btnInscription);

    setVisible(true);
  }

  public static void main(String[] args) {
    new Home();
  }
}
