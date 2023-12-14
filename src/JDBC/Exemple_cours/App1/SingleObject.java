package JDBC.Exemple_cours.App1;

public class SingleObject {
  // create an oblect of singleObjet
  private static SingleObject instance = new SingleObject();

  // make the construnctor private so that this class cannot bz instantiated
  private SingleObject() {}

  // get the only object available
  public static SingleObject getInstance(){
    return instance;
  }

  public void showMessage(){
    System.out.println("Hello World!");
  }
}