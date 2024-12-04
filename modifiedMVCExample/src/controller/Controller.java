
import java.util.List;

public class Controller {
    private List<Student> students;
    private View view;

    public Controller(List<Student> students, View view) {
        this.students = students;
        this.view = view;
    }

    public void showStudentDetails() {
        for (Student student : students) {
            view.printStudentDetails(student);
        }
    }

    public void showAggregatedDetails() {
        double totalGpa = 0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }
        double averageGpa = students.isEmpty() ? 0 : totalGpa / students.size();
        view.printAggregatedDetails(averageGpa, students.size());
    }
}
