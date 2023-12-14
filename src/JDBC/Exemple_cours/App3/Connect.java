package JDBC.Exemple_cours.App3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
  private static Connection con;

  static {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/essay", "root", "");
    } catch (ClassNotFoundException e) {
      System.out.println("Problème au niveau de pilote");
    } catch (SQLException e) {
      System.out.println("Problème au niveau de base ou accès au données");
    }
  }

  public static Connection getCon() {
    return con;
  }
}
