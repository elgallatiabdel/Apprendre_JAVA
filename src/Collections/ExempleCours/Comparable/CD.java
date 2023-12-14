package Collections.ExempleCours.Comparable;

public class CD implements Comparable {
  private String auteur, titre;
  private double prix;
  public CD(String auteur, String titre, double prix) {
    this.auteur = auteur;
    this.titre = titre;
    this.prix = prix;
  }
  public String getAuteur() {
    return auteur;
  }
  public String getTitre() {
    return titre;
  }
  public double getPrix() {
    return prix;
  }
  
  @Override
  public String toString() {
    return "CD [auteur=" + auteur + ", titre=" + titre + ", prix=" + prix + "]";
  }
  @Override
  public int compareTo(Object o) {
    if(o.getClass().equals(CD.class)) {
      CD cd = (CD) o;
      return this.auteur.compareTo(cd.auteur);
    }
    return -1;
  }

  
}
