/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import models.Person;

/**
 *
 * @author quoch
 */
public class GeneralView {
    
    public ArrayList getPathAndMoney(){
        ArrayList result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- Person info ---------");
        System.out.println("Enter Path: ");
        String path = sc.nextLine();
        result.add(path);
        System.out.println("Enter Money: ");
        double money = sc.nextDouble();
        result.add(money);
        return result;
    }
    public void displayResult(String nameMin, String nameMax, ArrayList<Person> list){
        System.out.println("------------- Result ----------");
        System.out.format("%-20s %-20s %-10s \n","Name","Address","Money");
        for(Person p: list){
            System.out.format("%-20s %-20s %-10f \n", p.getName(), p.getAddress(), p.getSalary());
        }
        System.out.println("Max: " + nameMax);
        System.out.println("Min: "+ nameMin);
    }
    
    public String[] getSource(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- Copy Text ---------");
        System.out.println("Enter Source: ");
        String source = sc.nextLine();
        System.out.println("Enter new file name: ");
        String newSource = sc.nextLine();
        return new String[]{source, newSource};
    }
    
    public void displayMessage(String message){
        System.out.println(message);
    }
}
