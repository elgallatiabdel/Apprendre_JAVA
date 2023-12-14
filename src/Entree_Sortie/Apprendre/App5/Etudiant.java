package Entree_Sortie.Apprendre.App5;

import java.io.Serializable;

public class Etudiant implements Serializable {
  private String code;
  private String matiere;
  private float note;

  public Etudiant(String code, String matiere, float note) {
    this.code = code;
    this.matiere = matiere;
    this.note = note;
  }

  public Etudiant() {}

  public String getCode() {
    return code;
  }

  public String getMatiere() {
    return matiere;
  }

  public float getNote() {
    return note;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setMatiere(String matiere) {
    this.matiere = matiere;
  }

  public void setNote(float note) {
    this.note = note;
  }

  @Override
  public String toString() {
    return "Etudiant [code=" + code + ", matiere=" + matiere + ", note=" + note + "]";
  }

  

}
