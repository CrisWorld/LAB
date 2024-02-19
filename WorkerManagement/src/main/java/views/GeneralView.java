/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import com.mycompany.workermanagement.Validator;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import models.History;
import models.Worker;

/**
 *
 * @author quoch
 */
public class GeneralView {
    
    public int i;
    public void displayInformationSalary(ArrayList<Worker> Workers) {
          Formatter fmt = new Formatter();
          System.out.format("%-10s %-20s %-10s %-20s %-20s %-10s","++Code++","++Name++","++Age++","++Salary++", "++Status++", "++Date++");
          System.out.println("");
          for (int i=0;i<Workers.size();i++){
              Worker p = Workers.get(i);
              ArrayList<History> histories = p.getInformationHistory();
              for(History h: histories){
                System.out.format("%-10s %-20s %-10s %-20s %-20s %-10s", p.getCode(), p.getName(), p.getAge(), h.getSalary(), h.getStatus(), h.getDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
                System.out.println(""); 
              }  
          }
 
          
}
    public Worker getWorker(){
        Validator validator = new Validator();
         System.out.println("---------- Add Worker ----------");
       Scanner sc;
       String code, name, worklocation;
       int age;
       double salary;
       System.out.println("Enter Code:");
       sc = new Scanner(System.in);
       code = sc.nextLine();
       System.out.println("Enter Name: ");
       sc = new Scanner(System.in);
       name = sc.nextLine();
       do{
           System.out.println("Enter Age: ");
            sc = new Scanner(System.in);
            age = sc.nextInt();
            if(validator.isEnough(age, 18, 50)) break; else System.out.println("18 <= age <= 50");
       } while(true);
       
       do{
            System.out.println("Enter Salary: ");
            sc = new Scanner(System.in);
            salary = sc.nextDouble();
            if(salary > 0) break; else System.out.println("Salary must be more than 0");
       } while(true);
       System.out.println("Enter Work Location: ");
       sc = new Scanner(System.in);
       worklocation = sc.nextLine();
       return new Worker(code, name, worklocation, salary, age);
    }
    
    public String getCode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Code: ");
        return sc.nextLine();
    }
    
    public double getUpSalary(){
            System.out.println("---------- Up Salary ----------");
            System.out.println("Up Salary: ");
            Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public double getDownSalary(){
        System.out.println("---------- Down Salary ----------");
            System.out.println("Down Salary: ");
            Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    
    public void displayMessage(String message){
        System.out.println(message);
    }

}
