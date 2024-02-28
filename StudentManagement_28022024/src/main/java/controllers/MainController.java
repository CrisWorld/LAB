/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Student;

/**
 *
 * @author quoch
 */
public class MainController extends Menu{
    private List<Student> students;
    public MainController(String title, String[] options){
        super(title, options);
        students = new ArrayList<Student>();
        students.add(new Student("John Doe", "Class A", 85.5));
        students.add(new Student("Jane Smith", "Class B", 92.0));
        students.add(new Student("Bob Johnson", "Class A", 78.3));
        students.add(new Student("Alice Williams", "Class C", 95.7));
        students.add(new Student("Charlie Brown", "Class B", 88.9));
        students.add(new Student("Emily Davis", "Class C", 91.2));
        students.add(new Student("Michael Miller", "Class A", 76.8));
        students.add(new Student("Olivia Jones", "Class B", 89.5));
        students.add(new Student("Daniel Wilson", "Class C", 94.1));
        students.add(new Student("Sophia Lee", "Class A", 82.4));
    }
    @Override
    public void execute(int n) {
        StudentController controller = new StudentController();
        switch(n){
            case 1:
                controller.run(students);
                break;
            case 2:
                controller.display(students);
                break;
            default:
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        String title = "====== Collection Sort Program ======";
        String[] options = {"Add student", "Display sorted list", "Exit"};
        new MainController(title, options).run();
    }
}
