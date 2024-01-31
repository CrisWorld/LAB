/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import models.Doctor;

/**
 *
 * @author sewrf
 */
public class DoctorView {

    private int i;
    public void showDoctors(ArrayList<Doctor> Doctors) {
        Formatter fmt = new Formatter();
        System.out.format("%-10s %-20s %-30s %-20s","++Code++","++Name++","++Specialization++","++Availability++");
        System.out.println("");
        for(int i=0; i< Doctors.size(); i++){
            Doctor p = Doctors.get(i);
            System.out.format("%-10s %-20s %-30s %-20s", p.getCode(), p.getName(),p.getSpecialization(),p.getAvailability());
            System.out.println("");
        }
    }
    public Doctor getDoctor(int type){
       if(type == 1){
           System.out.println("---------- Add Doctor ----------");
       } else System.out.println("---------- Update Doctor ----------");
       Scanner sc;
       String code, name, specialization;
       int availability;
       System.out.println("Enter Code:");
       sc = new Scanner(System.in);
       code = sc.nextLine();
       System.out.println("Name: ");
       sc = new Scanner(System.in);
       name = sc.nextLine();
       System.out.println("Specialization: ");
       sc = new Scanner(System.in);
       specialization = sc.nextLine();
       System.out.println("Availability: ");
       sc = new Scanner(System.in);
       availability = sc.nextInt();
       return new Doctor(code, name, specialization, availability);
    }
    
    public String getDeleteCode(){
        System.out.println("---------- Delete Doctor ----------");
        System.out.println("Enter Code:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public String getSearchText(){
        System.out.println("---------- Search Doctor ----------");
        System.out.println("Enter text:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public void displayMessage(String message){
        System.out.println(message);
    }
}
