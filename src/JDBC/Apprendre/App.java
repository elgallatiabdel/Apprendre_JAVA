package JDBC.Apprendre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class App {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_catal", "root", "");
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("SELECT * FROM produits");
      while (rs.next()) {
        System.out.println(rs.getString("nom"));
      }

      ResultSetMetaData rsmd = rs.getMetaData();
      for(int i = 1; i<= rsmd.getColumnCount(); i++) {
        System.out.println(rsmd.getColumnName(i) + "\t");
      }
      System.out.println();
      while (rs.next()) {
        for(int i = 1; i<= rsmd.getColumnCount(); i++) {
          System.out.println(rs.getString(i) + "\t");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
