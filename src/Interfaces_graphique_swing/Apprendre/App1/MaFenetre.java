package Interfaces_graphique_swing.Apprendre.App1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MaFenetre extends JFrame implements ActionListener {
  JLabel jL1 = new JLabel("Nom: ");
  JTextField jT1 = new JTextField(12);
  JButton jB1 = new JButton("Add");
  JButton jB2 = new JButton("Delete");
  List liste1 = new List();
  List liste2 = new List();

  public MaFenetre() {
    // this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setLayout(new BorderLayout());
    JPanel jp1 = new JPanel();
    jp1.add(jL1);
    jp1.add(jT1);
    jp1.add(jB1);
    jp1.add(jB2);
    this.add(jp1, BorderLayout.NORTH);

    JPanel jp2 = new JPanel();
    jp2.setLayout(new GridLayout());
    jp2.add(liste1);
    jp2.add(liste2);

    jB1.addActionListener(this);
    jB2.addActionListener(this);

    this.add(jp2, BorderLayout.CENTER);
    // this.setBounds(10,10,500,500);
    this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MaFenetre();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == jB1) {
      String s = jT1.getText();
      liste1.add(s);
      jT1.setText("");
    } else if(e.getSource() == jB2) {
      int num = liste1.getSelectedIndex();
      liste1.remove(num);
    }
  }
}
