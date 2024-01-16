/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Models.Student;
import Models.Validator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class FormView {
     public char displayUpdateOrDeleteMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to update (U) or delete (D) student");
        char c = sc.nextLine().toUpperCase().charAt(0);
        return c;
    }
     public void displayAllStudent(ArrayList<Student> students){
         System.out.println("Sutdent List");
         for(Student student: students){
             System.out.println(student);
         }
     }
    public int getStudentID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        return sc.nextInt();
    }
    public ArrayList displayUpdateForm(){
        ArrayList result = new ArrayList();
        Validator validator = new Validator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with empty If you want to hold data");
        System.out.println("Student name: ");
        String name = sc.nextLine();
        result.add(name);
        System.out.println("Semester: ");
        String number = sc.nextLine();
        int semester = -1;
        if(!number.equals("")){
            try{
                semester = Integer.parseInt(number);
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }
        result.add(semester);
        return result;
    }
    public Student displayCreateStudentForm(){
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        System.out.println("Enter student name");
        String name = sc.nextLine();
        System.out.println("Semester: ");
        int semester = sc.nextInt();
        int courseSelected;
        do{
            System.out.println("Courses (1. Java, 2. .Net, 3. C/C++):");
            courseSelected = sc.nextInt();
        } while(!validator.isEnough(courseSelected, 1, 3));
        return new Student(name, semester, courseSelected);
    }
    public ArrayList<Student> displayCreateStudentMenu(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> result = new ArrayList<Student>();
        int count = 0;
        do{
            result.add(displayCreateStudentForm());
            count++;
            if(count > 10) {
                System.out.println("Do you want to continue (Y/N)? ");
                char c = sc.nextLine().toUpperCase().charAt(0);
                if(c == 'N') break;
            }
        } while(true);
        return result;
    }
    public int getCourseSelected(){
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        int courseSelected;
        do{
            System.out.println("Courses (1. Java, 2. .Net, 3. C/C++):");
            courseSelected = sc.nextInt();
        } while(!validator.isEnough(courseSelected, 1, 3));
        return courseSelected;
    }
}
