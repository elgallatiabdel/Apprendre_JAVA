package Exceptions.Apprendre.Point;

public class Except6 {
  public static void main(String[] args) {
    try {
      Point2 p = new Point2(1, 4);
      p.f();
    } catch (ErrConst e) {
      System.out.println("Dans catch ErrConst de main");
    } finally {
      System.out.println("Finally de main");
    }
    System.out.println("après bloc try main");
  }
}
