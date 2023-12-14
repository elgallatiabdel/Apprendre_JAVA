package Exceptions.Apprendre.Point;

public class Except3 {
  public static void main(String[] args) {
    try {
      Point a = new Point(1, 4);
      a.affiche();
      a.deplace(-3, 5);
      a.affiche();
      a = new Point(-3, 2);
      a.affiche();
    } catch (ErrConst e) {
      System.out.println("Erreur de construction de Point");
      System.out.println("Coordonnées souhaitées : (" + e.abs + " , " + e.ord + ")");
      System.exit(-1);
    } catch (ErrDepl e) {
      System.out.println("Erreur de déplacement de Point");
      System.out.println(e.getMessage());
      System.exit(-1);
    } 
  }
}
