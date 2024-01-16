/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controllers;

import Models.Student;
import java.util.ArrayList;

/**
 *
 * @author quoch
 */
public class StudentManagement {
    private ArrayList<Student> students;
    public StudentManagement() {
        students = new ArrayList<Student>();
        students.add(new Student("Hoang Quoc", 1, 1));
        students.add(new Student("Van Dat", 2, 2));
        students.add(new Student("Thanh Dat", 1, 1));
        students.add(new Student("Nhat Truong", 1, 3));
        students.add(new Student("Truc Vy", 1, 2));
        students.add(new Student("Van Bao", 1, 1));
        students.add(new Student("Thai Phuc", 1, 3));
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public Student getStudentIfExist(int id){
        for(Student student: students){
            if(student.getId() == id) return student;
        }
        return null;
    }
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        String title = "Student Management";
        String[] options = new String[]{"Create new student", "Find/Sort Student", "Update/Delete student", "Report", "Add course for student"};
        Main main = new Main(studentManagement, title, options);
        main.run();
    }
}
