package JDBC.Exemple_cours.App1;

public class SingletonPatternDemo {
  public static void main(String[] args) {
    // illegal construct
    // compile time error: the constructor SingleObject() is not visible
    // SingleObject object = new SingleObject();

    // get the only object available
    SingleObject object1 = SingleObject.getInstance();

    // show the message
    object1.showMessage();
  }
}
