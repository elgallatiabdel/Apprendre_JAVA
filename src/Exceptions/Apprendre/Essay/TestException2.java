package Exceptions.Apprendre.Essay;

public class TestException2 {
  public static void main(String[] args) {
    int[] t = {6,2,7,9,7};
    try {
      try {
        System.out.println("Début");
        int x = 1/(t[4] - t[2]);
        int y = t[5];
        System.out.println("Affectation terminees!");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Indice incorrect");
      } finally {
        System.out.println("Fin de affectuer");
      }
    } catch (ArithmeticException e) {
      System.out.println("Opération impossible");
    }
    System.out.println("Fin");
  }
}
