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
public class CalculatorView {
    public String getNumberInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextLine();
    }
    public char getOperatorInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator: ");
        return  sc.nextLine().charAt(0);
    }
    public void setResult(String result, boolean flag){
        if(flag) System.out.println("Memory: "+result);
        else System.out.println("Result: "+result);
    }
    public void displayErrorMessage(String message){
        System.out.println("Error: " + message);
    }
}
