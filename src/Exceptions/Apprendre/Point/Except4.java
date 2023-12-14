package Exceptions.Apprendre.Point;

public class Except4 {
  public static void main(String[] args) {
    System.out.println("Avant bloc try");
    try {
      Point a = new Point(1,4);
      a.affiche();
      a.deplace(-3, 5);
      a.affiche();
    } catch (ErrConst e) {
      System.out.println("Erreur de construction");
    } catch (ErrDepl e) {
      System.out.println("Erreur de deplacement");
    }
    System.out.println("Après bloc try");
  }
}
