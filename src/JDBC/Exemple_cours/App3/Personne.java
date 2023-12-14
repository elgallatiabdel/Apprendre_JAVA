package JDBC.Exemple_cours.App3;

public class Personne {
  private int num;
  private String nom;
  private String prenom;

  public Personne(int num, String nom, String prenom) {
    super();
    this.num = num;
    this.nom = nom;
    this.prenom = prenom;
  }

  public int getNum() {
    return num;
  }

  public String getNom() {
    return nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

}
