package JDBC.Exemple_cours.App2;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
  List<Student> students;

  public StudentDaoImpl () {
    students = new ArrayList<Student>();
    Student s1 = new Student("abdelilah", 0);
    Student s2 = new Student("mahdi", 1);
    students.add(s1);
    students.add(s2);
  }

  @Override
  public List<Student> getAllStudents() {
    return students;
  }

  @Override
  public Student getStudent(int rollNo) {
    return students.get(rollNo);
  }

  @Override
  public void deleteStudent(Student s) {
    students.remove(s.getrollNo());
    System.out.println("Student: Roll No " + s.getrollNo() + ", deleted from database");
  }

  @Override
  public void updateStudent(Student s) {
    students.get(s.getrollNo()).setName(s.getName());
    System.out.println("Student: Roll No " + s.getrollNo() + ", updated from database");
  }
}
