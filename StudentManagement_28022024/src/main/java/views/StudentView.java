/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import common.Validator;
import java.util.List;
import java.util.Scanner;
import models.Student;

/**
 *
 * @author quoch
 */
public class StudentView {
    public Student getStudentInput() {
        Scanner scanner = new Scanner(System.in);
        double mark;
        String str;
        System.out.println("====== Collection Sort Program ======");
        System.out.println("Please input student information");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Classes: ");
        String classes = scanner.nextLine();
        do{
            Validator validator = new Validator();
            System.out.print("Mark: ");
            str = scanner.nextLine();
            if(validator.isNumeric(str)) {
                mark = Double.parseDouble(str);
                break;
            } else System.out.println("Data is not numeric. please re-enter !");
        } while(true);

        return new Student(name, classes, mark);
    }
    
    public char getChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to enter more student information? (Y/N): ");
        char choice = scanner.nextLine().charAt(0);
        return choice;
    }
    
    public void display(List<Student> students){
        for(int i=0; i<students.size(); i++){
            System.out.println("-------------Student "+(i+1)+"-------------");
            System.out.println(students.get(i));
        }
    }
}
