package com.example.mvc.controller;

import com.example.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    // Sample data
    private List<Student> students = new ArrayList<>();

    // Constructor to add some initial data
    public StudentController() {
        students.add(new Student(1, "Alice", 3.8));
        students.add(new Student(2, "Bob", 3.6));
        students.add(new Student(3, "Charlie", 3.9));
    }

    // Show all students
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", students);
        return "allStudents";
    }

    // Show details of a single student by ID
    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable int id, Model model) {
        for (Student student : students) {
            if (student.getId() == id) {
                model.addAttribute("student", student);
                return "studentDetails";
            }
        }
        model.addAttribute("error", "Student not found");
        return "studentDetails";
    }
}
