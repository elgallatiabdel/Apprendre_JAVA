package Socket.Exemples_cours;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exemple2 {
  public static void main(String args[]) {
    try {
      InetAddress inet = InetAddress.getByAddress(new byte[] { (byte) 10, (byte) 20, (byte) 72, (byte) 5 });
      System.out.println("IP : " + inet.getHostAddress());
      System.out.println("Name : " + inet.getHostName());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}