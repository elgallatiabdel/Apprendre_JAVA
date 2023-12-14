package Exceptions.Apprendre.Point;

public class Except5 {
  public static void main(String[] args) {
    try {
      TestPoint();
    } catch (ErrPoint e) {
      System.out.println("Erreur sur un point");
    }
  }

  static void TestPoint() throws ErrConst, ErrDepl {
    Point2 p1 = new Point2(3,4);
    p1.affiche();
    p1.deplace(-5, 2);
    p1.affiche();
  }
}
