package Socket.Exemples_cours;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exemple1 {
  public static void main(String[] args) throws Exception {
    try {
      InetAddress inet = InetAddress.getByName("localhost");
      System.out.println("IP : " + inet.getHostAddress());
      System.out.println("Name : " + inet.getHostName());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
