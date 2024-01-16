/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Course;
import Models.Student;
import Views.FormView;
import Views.Menu;
import Views.ReportView;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class Main extends Menu{
    private StudentManagement studentManagement;
    public Main(StudentManagement studentManagement, String title, String[] options){
        super(title, options);
        this.studentManagement = studentManagement;
    }
    @Override
    public void execute(int n) {
        FormView fw = new FormView();
        ReportView rw = new ReportView();
        switch(n){
            case 1:
                ArrayList<Student> students = fw.displayCreateStudentMenu();
                if(students != null) studentManagement.getStudents().addAll(students);
                break;
            case 2:
                studentManagement.getStudents().sort((Student o1, Student o2) -> o1.getName().compareTo(o2.getName()));
                fw.displayAllStudent(studentManagement.getStudents());
                break;
            case 3:
                fw.displayAllStudent(this.studentManagement.getStudents());
                int id = fw.getStudentID();
                Student student = studentManagement.getStudentIfExist(id);
                switch(fw.displayUpdateOrDeleteMenu()){
                    case 'U':
                        if(student != null){
                            ArrayList result = fw.displayUpdateForm();
                            if(!result.get(0).equals("")){
                                student.setName(result.get(0).toString());
                            }
                            if((int)result.get(1) != -1){
                                student.setSemester((int) result.get(1));
                            }
                        } else {
                            System.out.println("Student doesn't exist");
                        }
                        break;
                    case 'D':
                        if(student != null){
                            studentManagement.getStudents().remove(student);
                        }
                        break;
                }
                break;
            case 4:
                rw.showReport(studentManagement.getStudents());
                break;
            case 5:
                fw.displayAllStudent(studentManagement.getStudents());
                int sid =  fw.getStudentID();
                Student s = studentManagement.getStudentIfExist(sid);
                if(s != null){
                    int courseSelected = fw.getCourseSelected();
                    Course course;
                    if(courseSelected == 1){
                        course = s.getCourseIfExist("Java");
                    } else if(courseSelected == 2){
                        course = s.getCourseIfExist(".Net");
                    } else course = s.getCourseIfExist("C/C++");
                    if(course != null){
                        int newCount = course.getCount();
                        newCount++;
                        course.setCount(newCount);
                    } else {
                        s.getCourses().add(new Course(courseSelected));
                    }
                }
        }
    }
}
