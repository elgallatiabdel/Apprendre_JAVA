package JDBC.Exemple_cours.App3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Personne_Jdbc implements IPersonne {

  @Override
  public void addPersonne(Personne p) {
    Connection con = Connect.getCon();
    String req = "insert into personne(nom,prenom) values (?,?)";
    try {
      PreparedStatement ps = con.prepareStatement(req);
      ps.setString(1, p.getNom());
      ps.setString(2, p.getPrenom());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void updatePersonne(Personne p) {
    Connection con = Connect.getCon();
    String req = "Update personne set nom=?, prenom=? where id=?";
    try {
      PreparedStatement ps = con.prepareStatement(req);
      ps.setString(1, p.getNom());
      ps.setString(2, p.getPrenom());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public Personne getPersonne(int id) {
    Personne pers = null;
    Connection con = Connect.getCon();
    String req = "Select * from personne where id=?";
    try {
      PreparedStatement ps = con.prepareStatement(req);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      if(rs.next()) {
        pers = new Personne(id, rs.getString("nom"), rs.getString("prenom"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return pers;
  }

  @Override
  public List<Personne> getPersonnes() {
    PreparedStatement ps;
    ResultSet rs;
    List<Personne> personnes = new ArrayList<Personne>();
    Connection con = Connect.getCon();
    String req = "select * from personne";

    try {
      ps = con.prepareStatement(req);
      rs = ps.executeQuery();
      while (rs.next()) {
        Personne pers = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
        personnes.add(pers);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return personnes;
  }
  
}
