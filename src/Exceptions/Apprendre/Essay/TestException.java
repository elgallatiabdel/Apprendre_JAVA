package Exceptions.Apprendre.Essay;

public class TestException {

  public static void affectation(int i, int[] t) {
    try {
      int x = 1 / (t[i+2] - t[i]);
      int y = t[i+4];
    } catch (ArithmeticException e) {
      System.out.println("opération impossible");
    } finally {
      System.out.println("Fin de la procédure d'affectation");
    }
    System.out.println("fin de effectuer");
  }

  public static void main(String[] args) {
    int[] t = {6,2,7,9,7};
    try {
      System.out.println("début");
      affectation(2,t);
      System.out.println("affectation terminees!");
    }  catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("indice incorrecte");
    }
    System.out.println("fin");
  }
}
