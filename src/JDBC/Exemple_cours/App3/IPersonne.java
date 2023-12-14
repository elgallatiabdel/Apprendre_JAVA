package JDBC.Exemple_cours.App3;

import java.util.List;

public interface IPersonne {
  void addPersonne(Personne p);
  void updatePersonne(Personne p);
  Personne getPersonne(int id);
  List<Personne> getPersonnes();
} 
