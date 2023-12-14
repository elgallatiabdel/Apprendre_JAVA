package Socket.Calculette.Serveur;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
  public static void main(String[] args) {
    try {
      // Création d'un serveur écoutant sur le port 23456
      ServerSocket serverSocket = new ServerSocket(23456);

      System.out.println("Serveur en attente de connexions...");

      // Attente de la connexion d'un client
      Socket clientSocket = serverSocket.accept();

      System.out.println("Client connecté.");

      // Flux de lecture du client
      BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

      // Flux d'écriture vers le client
      PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

      // Lecture de l'expression du client
      String expression = reader.readLine();
      System.out.println("Expression reçue du client : " + expression);

      // Analyse de l'expression et calcul
      // String[] add = expression.split("\\+") ;
      // String[] soustraction = expression.split("\\-");
      // String[] produit = expression.split("\\*") ;
      // String[] division = expression.split("\\/");

      // if(add.length != 0) {
      // int nombre1 = Integer.parseInt(add[0]);
      // int nombre2 = Integer.parseInt(add[1]);
      // int resultat = nombre1 + nombre2;
      // // Réponse au client
      // writer.println("Le résultat reçu par le serveur : " + resultat);
      // } else if(soustraction.length != 0) {
      // int nombre1 = Integer.parseInt(soustraction[0]);
      // int nombre2 = Integer.parseInt(soustraction[1]);
      // int resultat = nombre1 - nombre2;
      // // Réponse au client
      // writer.println("Le résultat reçu par le serveur : " + resultat);
      // } else if(produit.length != 0) {
      // int nombre1 = Integer.parseInt(produit[0]);
      // int nombre2 = Integer.parseInt(produit[1]);
      // int resultat = nombre1 * nombre2;
      // // Réponse au client
      // writer.println("Le résultat reçu par le serveur : " + resultat);
      // } else if(division.length != 0) {
      // int nombre1 = Integer.parseInt(division[0]);
      // int nombre2 = Integer.parseInt(division[1]);
      // int resultat = nombre1 / nombre2;
      // // Réponse au client
      // writer.println("Le résultat reçu par le serveur : " + resultat);
      // }

      String[] add = expression.split("\\+");
      String[] soustraction = expression.split("\\-");
      String[] produit = expression.split("\\*");
      String[] division = expression.split("\\/");

      if (add.length == 2) {
        int nombre1 = Integer.parseInt(add[0]);
        int nombre2 = Integer.parseInt(add[1]);
        int resultat = nombre1 + nombre2;
        // Réponse au client
        writer.println("Le résultat reçu par le serveur : " + resultat);
      } else if (soustraction.length == 2) {
        int nombre1 = Integer.parseInt(soustraction[0]);
        int nombre2 = Integer.parseInt(soustraction[1]);
        int resultat = nombre1 - nombre2;
        // Réponse au client
        writer.println("Le résultat reçu par le serveur : " + resultat);
      } else if (produit.length == 2) {
        int nombre1 = Integer.parseInt(produit[0]);
        int nombre2 = Integer.parseInt(produit[1]);
        int resultat = nombre1 * nombre2;
        // Réponse au client
        writer.println("Le résultat reçu par le serveur : " + resultat);
      } else if (division.length == 2) {
        int nombre1 = Integer.parseInt(division[0]);
        int nombre2 = Integer.parseInt(division[1]);
        if (nombre2 != 0) {
          int resultat = nombre1 / nombre2;
          // Réponse au client
          writer.println("Le résultat reçu par le serveur : " + resultat);
        } else {
          writer.println("Erreur : division par zéro.");
        }
      } else {
        writer.println("Erreur : opération non reconnue.");
      }

      // // Réponse au client
      // writer.println("Le résultat reçu par le serveur : " + resultat);

      // Fermeture des ressources
      reader.close();
      writer.close();
      clientSocket.close();
      serverSocket.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
