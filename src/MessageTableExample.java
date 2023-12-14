import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MessageTableExample extends JFrame {

  private JTable messageTable;
  private DefaultTableModel tableModel;

  public MessageTableExample() {
    // Initialisation de la table et du modèle
    tableModel = new DefaultTableModel();
    messageTable = new JTable(tableModel);

    // Ajout de la table à un JScrollPane pour permettre le défilement
    JScrollPane scrollPane = new JScrollPane(messageTable);

    // Ajout du JScrollPane à la JFrame
    add(scrollPane);

    setTitle("Tableau de Messages");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // Centrer la fenêtre
    setVisible(true);

    // Remplir la table avec les données de la base de données
    loadDataFromDatabase();
  }

  private void loadDataFromDatabase() {
    // Remplacez ces détails de connexion par ceux de votre propre base de données
    String jdbcUrl = "jdbc:mysql://localhost:3306/messagerie";
    String user = "root";
    String password = "";

    try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT sujet, texte FROM message")) {

      // Récupération des métadonnées pour déterminer le nombre de colonnes
      int columnCount = resultSet.getMetaData().getColumnCount();

      // Ajout des colonnes au modèle de table
      for (int i = 1; i <= columnCount; i++) {
        tableModel.addColumn(resultSet.getMetaData().getColumnName(i));
      }

      // Ajout des données de la base de données au modèle de table
      while (resultSet.next()) {
        Object[] row = new Object[columnCount];
        for (int i = 1; i <= columnCount; i++) {
          row[i - 1] = resultSet.getObject(i);
        }
        tableModel.addRow(row);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new MessageTableExample());
  }
}