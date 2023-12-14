package Exceptions.Apprendre.Point;

public class Point2 {
  public Point2(int x, int y) throws ErrConst {
    if (x < 0 || y < 0) throw new ErrConst();
    this.x = x;
    this.y = y;
  }

  public Point2() {}

  public void f() throws ErrConst {
    try {
      Point2 p = new Point2(-3, 2);
    } catch (ErrConst e) {
      System.out.println("dans la catch ErrConst de f");
      throw e;
    } finally {
      System.out.println("Finally de f");
    }
  }

  public void affiche() {
    System.out.println("Le point est à (" + x + ", " + y + ")");
  }

  public void deplace(int dx, int dy) throws ErrDepl {
    if (x+dx < 0 || y+dy < 0) throw new ErrDepl();
    x += dx;
    y += dy;
  }

  private int x, y;
}
