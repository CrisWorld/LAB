/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;
import models.StringAnalyzer;

/**
 *
 * @author quoch
 */
public class StringAnalyzerView {
    public String getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Analysis String program =====");
        System.out.println("Input String:");
        return sc.nextLine();
    }

    public void displayResults(StringAnalyzer model) {
        System.out.println("-----Result Analysis------");
        System.out.println("Perfect Square Numbers: " + model.getPerfectSquareNumbers());
        System.out.println("Odd Numbers: " + model.getOddNumbers());
        System.out.println("Even Numbers: " + model.getEvenNumbers());        
        System.out.println("All Numbers: " + model.getAllNumbers());        
        System.out.println("Uppercase Characters: " + model.getUppercaseCharacters());
        System.out.println("Lowercase Characters: " + model.getLowercaseCharacters());
        System.out.println("Special Characters: " + model.getSpecialCharacters());
        System.out.println("All Characters: " + model.getAllCharacters());
    }
}
