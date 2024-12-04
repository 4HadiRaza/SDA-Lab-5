
import java.util.List;

public class View {
    public void printStudentDetails(Student student) {
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
        System.out.println();
    }

    public void printAggregatedDetails(double averageGpa, int totalStudents) {
        System.out.println("Aggregated Details:");
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Average GPA: " + averageGpa);
    }
}
