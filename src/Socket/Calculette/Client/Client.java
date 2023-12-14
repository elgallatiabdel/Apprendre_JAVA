package Socket.Calculette.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    try {
      // Connexion au serveur sur le port 23456 (remplacez "localhost" par l'adresse IP du serveur)
      Socket s = new Socket("localhost", 23456);

      // Flux de lecture du serveur
      BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

      // Flux d'écriture vers le serveur
      PrintWriter writer = new PrintWriter(s.getOutputStream(), true);

      // entrer l'expression
      try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("donnez le nombre 1 : ");
        int nb1 = scanner.nextInt();
        System.out.print("donnez l'oprérateur : ");
        String opretateur = scanner.next();
        System.out.print("donnez le nombre 2 : ");
        int nb2 = scanner.nextInt();
        // Envoi d'une expression au serveur
        writer.println(nb1+opretateur+nb2);
      }

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
