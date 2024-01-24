/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.mycompany.number.Validator;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class Information {
    public double[] getNumbersOfQuadraticEquation (){
        System.out.println("Calculate Quadratic Equation ");
        Scanner sc;
        double a,b,c;
        Validator validator = new Validator();
        do{
            System.out.println("Enter A:");
            sc = new Scanner(System.in);
            String aStr = sc.nextLine();
            if(validator.isNumber(aStr)) {
                a = Double.parseDouble(aStr);
                break;
            }
            System.out.println("Please input number");
        } while(true);
        do{
            System.out.println("Enter B:");
            sc = new Scanner(System.in);
            String bStr = sc.nextLine();
            if(validator.isNumber(bStr)) {
                b = Double.parseDouble(bStr);
                break;
            }
            System.out.println("Please input number");
        } while(true);
        do{
            System.out.println("Enter B:");
            sc = new Scanner(System.in);
            String cStr = sc.nextLine();
            if(validator.isNumber(cStr)){
                c = Double.parseDouble(cStr);
                break;
            }
            System.out.println("Please input number");
        } while(true);
        return new double[]{a,b,c};
    }
    public double[] getNumbersOfSimpleEquation (){
        System.out.println("Calculate Equation");
        Scanner sc;
        double a,b;
        Validator validator = new Validator();
        do{
            System.out.println("Enter A:");
            sc = new Scanner(System.in);
            String aStr = sc.nextLine();
            if(validator.isNumber(aStr)) {
                a = Double.parseDouble(aStr);
                break;
            }
            System.out.println("Please input number");
        } while(true);
        do{
            System.out.println("Enter B:");
            sc = new Scanner(System.in);
            String bStr = sc.nextLine();
            if(validator.isNumber(bStr)) {
                b = Double.parseDouble(bStr);
                break;
            }
            System.out.println("Please input number");
        } while(true);
        return new double[]{a,b};
    }
}
