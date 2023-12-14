package Socket.Exemples_cours;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {
  public static void main(String[] args) {
    try {
      // Connexion au serveur sur le port 12345 (remplacez "localhost" par l'adresse
      // IP du serveur)
      Socket s = new Socket("localhost", 23456);

      // Flux de lecture du serveur
      BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

      // Flux d'écriture vers le serveur
      PrintWriter writer = new PrintWriter(s.getOutputStream(), true);

      // Envoi d'un message au serveur
      writer.println("Bonjour, serveur de localhost!");

      // Lecture de la réponse du serveur
      String serverResponse = reader.readLine();
      System.out.println("Réponse du serveur : " + serverResponse);

      // Fermeture des ressources
      reader.close();
      writer.close();
      s.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
