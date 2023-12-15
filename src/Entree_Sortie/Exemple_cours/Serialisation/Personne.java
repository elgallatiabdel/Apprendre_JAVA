package Entree_Sortie.Exemple_cours.Serialisation;

import java.io.Serializable;

public class Personne implements Serializable {
  static private final long seialVersionUID = 6L;
  private String nom;
  private String prenom;
  private Integer age;

  public Personne(String nom, String prenom, Integer age) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
  }
  
  public Personne() {}

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Personne [nom = " + nom + ", prenom = " + prenom + ", age = " + age + "]";
  }

    
}
