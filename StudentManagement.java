import java.util.ArrayList;

public class StudentManagement {
  ArrayList<Student> students = new ArrayList<Student>();
  
  public void addStudent(Student s) {
    students.add(s);
  }
  
  public void removeStudent(Student s) {
    students.remove(s);
  }
  
  public Student getStudent(int id) {
    for (Student s : students) {
      if (s.getId() == id) {
        return s;
      }
    }
    return null;
  }
  
  public void printStudents() {
    for (Student s : students) {
      System.out.println(s.getName() + " (" + s.getId() + ")");
    }
  }
  
  public static void main(String[] args) {
    StudentManagement manager = new StudentManagement();
    
    // Add some students
    manager.addStudent(new Student(1, "Alice"));
    manager.addStudent(new Student(2, "Bob"));
    manager.addStudent(new Student(3, "Charlie"));
    
    // Print the list of students
    manager.printStudents();
    
    // Remove a student
    manager.removeStudent(manager.getStudent(2));
    
    // Print the updated list of students
    manager.printStudents();
  }
}

class Student {
  private int id;
  private String name;
  
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
}
