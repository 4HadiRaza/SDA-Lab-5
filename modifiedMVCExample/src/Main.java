
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hadi", 20, 3.8));
        students.add(new Student("Raza", 22, 3.6));
        students.add(new Student("Kazmi", 19, 3.9));

        View view = new View();

        Controller controller = new Controller(students, view);

        controller.showStudentDetails();

        controller.showAggregatedDetails();
    }
}
