/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class BMIView {
    public String getWeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight(kg): ");
        return sc.nextLine();
    }
    public String getHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height(cm): ");
        return sc.nextLine();
    }
    public void setResult(double m, double kg, String result){
        System.out.println("BMI NumberL "+ (kg / (m * m / 10000)));
        System.out.println("BMI status: "+ result);
    }
    public void displayErrorMessage(String message){
        System.out.println("Error: " + message);
    }
}
