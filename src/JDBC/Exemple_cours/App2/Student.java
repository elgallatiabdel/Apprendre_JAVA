package JDBC.Exemple_cours.App2;

public class Student {
  private String name;
  private int rollNo;

  Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getrollNo(){
    return rollNo;
  }

  public void setrollNo(int rollNo) {
    this.rollNo = rollNo;
  }
}
