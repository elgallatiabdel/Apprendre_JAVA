package JDBC.Exemple_cours.App2;

public class DaoPatternDemo {
  public static void main(String[] args) {
    StudentDao studentDao = new StudentDaoImpl();

    // print all student
    System.out.println("la liste de tout les students: ");
    for (Student s : studentDao.getAllStudents()) {
      System.out.println("Student: [RollNo : " + s.getrollNo() + ", Name : " + s.getName() + " ]");
    }

    // get the student
    System.out.println("Le student numéro 1: ");
    Student s = studentDao.getStudent(1);
    System.out.println("Student: [RollNo : " + s.getrollNo() + ", Name : " + s.getName() + " ]");

    System.out.println("la liste de tout les students après l'update: ");
    // update student
    Student s2 = studentDao.getStudent(1);
    s2.setName("Hamza");
    studentDao.updateStudent(s2);

    for (Student s3 : studentDao.getAllStudents()) {
      System.out.println("Student: [RollNo : " + s3.getrollNo() + ", Name : " + s3.getName() + " ]");
    }

    // delete student
    System.out.println("la liste de tout les students après delete: ");
    studentDao.deleteStudent(studentDao.getStudent(1));
    for (Student s4 : studentDao.getAllStudents()) {
      System.out.println("Student: [RollNo : " + s4.getrollNo() + ", Name : " + s4.getName() + " ]");
    }
    
  }
}
