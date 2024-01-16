/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Models.Course;
import Models.Student;
import java.util.ArrayList;

/**
 *
 * @author quoch
 */
public class ReportView {
    public void showReport(ArrayList<Student> students){
        for(Student student: students){
            for(Course course: student.getCourses()){
                System.out.println(student.getName() + "|" + course + "|" + course.getCount());
            }
        }
    }
}
