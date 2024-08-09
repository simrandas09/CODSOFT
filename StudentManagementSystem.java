import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to remove a student by roll number
    public boolean removeStudent(int rollNumber) {
        return students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    // Method to search for a student by roll number
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    // Method to display all students
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
