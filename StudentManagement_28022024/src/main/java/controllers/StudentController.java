/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.Student;
import views.StudentView;

/**
 *
 * @author quoch
 */
public class StudentController {
    private StudentView studentView;
    
    public StudentController() {
        this.studentView = new StudentView();
    }

    public List<Student> sortStudent(List<Student> students) {
        Collections.sort(students);
        return students;
    }

    public void run(List<Student> students) {
        char choice;

        do {
            Student student = studentView.getStudentInput();
            students.add(student);
            choice = studentView.getChoice();
        } while (choice == 'Y' || choice == 'y');
        students = sortStudent(students);
        studentView.display(students);
    }
    
    public void display(List<Student> students){
        studentView.display(sortStudent(students));
    }

}
