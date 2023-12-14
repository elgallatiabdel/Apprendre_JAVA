package Collections.ExempleCours;

public class Solo<T> {
  private T valeur;
  public Solo(T v) { this.valeur = v;}
  public Solo() { this.valeur = null;}
  public T getValeur() {
    return valeur;
  }
  public void setValeur(T valeur) {
    this.valeur = valeur;
  }

  @Override
  public String toString() {
    return "Solo [valeur=" + valeur + "]";
  }

  public static void main(String[] args) {
    Solo<Integer> SoloI = new Solo<Integer>(5);
    Solo<String> SoloS = new Solo<String>("Abdelilah");
    Solo<Float> SoloF = new Solo<Float>(12.25f);
    Solo<Double> SoloD = new Solo<Double>(12.2548);

    System.out.println(SoloI.toString());
    System.out.println(SoloS.toString());
    System.out.println(SoloF.toString());
    System.out.println(SoloD.toString());
  }
}
