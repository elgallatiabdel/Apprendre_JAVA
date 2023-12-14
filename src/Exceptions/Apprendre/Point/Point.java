package Exceptions.Apprendre.Point;

public class Point {
  public Point(int x, int y) throws ErrConst {
    if (x < 0 || y < 0) throw new ErrConst(x,y);
    this.x = x;
    this.y = y;
  }

  public Point() {}

  public void affiche() {
    System.out.println("Le point est à (" + x + ", " + y + ")");
  }

  public void deplace(int dx, int dy) throws ErrDepl {
    if (x+dx < 0 || y+dy < 0) throw new ErrDepl("Error de déplacement de coordonnées : (" + (x+dx) +" , "+ (y+dy) + ")");
    x += dx;
    y += dy;
  }

  private int x, y;
}
