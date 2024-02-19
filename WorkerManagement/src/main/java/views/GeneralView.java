/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import models.Worker;

/**
 *
 * @author quoch
 */
public class GeneralView {
    
    public int i;
    public void DisplayInformationSalary(ArrayList<Worker> Workers) {
          Formatter fmt = new Formatter();
          System.out.format("%-10s %-20s %-10s %-20s %-20 %-10,++Code++,++Name++,++Age++,++Salary++,Status++,++Date++ ");
          System.out.println("");
//          for (int i=0;i<Workers.size();i++){
//              Worker p = Workers.get(i);
//              ArrayList<History> histories = p.getInformationHistory();
//              for (i<Histories.size(); i++);
              System.out.format("%-10s %-20s %-10s %-20s %-20 %-10","12","Quang","20","11500","Up","28/09/2023");
              System.out.println("");   
//          }
 
          
}
    public Worker getWorker(){
         System.out.println("---------- Add Worker ----------");
       Scanner sc;
       String code, name, age, salary, worklocation;
       System.out.println("Enter Code:");
       sc = new Scanner(System.in);
       code = sc.nextLine();
       System.out.println("Enter Name: ");
       sc = new Scanner(System.in);
       name = sc.nextLine();
       System.out.println("Enter Age: ");
       sc = new Scanner(System.in);
       age = sc.nextLine();
       System.out.println("Enter Salary: ");
       sc = new Scanner(System.in);
       salary = sc.nextLine();
       System.out.println("Enter Work Location: ");
       sc = new Scanner(System.in);
       worklocation = sc.nextLine();
       return new Worker(code, name, age, salary, worklocation);
        }
    
    public String getupsalary(){
            System.out.println("---------- Up Salary ----------");
            System.out.println("Up Salary: ");
            Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String getdownsalary(){
        System.out.println("---------- Down Salary ----------");
            System.out.println("Down Salary: ");
            Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public void displayMessage(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {
        GeneralView view = new GeneralView();
        view.DisplayInformationSalary(null);
    }
}
