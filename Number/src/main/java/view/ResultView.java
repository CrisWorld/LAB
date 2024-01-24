/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author quoch
 */
public class ResultView {
    public void displaySolution(double[] result){
        if(result == null) {
            System.out.println("No solution");
            return;
        }
        System.out.println("Solution: x1 = "+result[0]+" and x2 = "+result[1]);
    }
    public void displaySolution(double result){
         System.out.println("Solution: x = "+result);
    }
    public void displayEvenAndOdd(ArrayList evens, ArrayList odds){
        System.out.print("Number is Odd: ");
        for(int i=0 ; i< odds.size() -1; i++){
            System.out.print(odds.get(i)+ ", ");
        }
        if(odds.size() > 0) System.out.println(odds.get(odds.size()-1)); else System.out.println("");
        System.out.print("Number is Even: ");
        for(int i=0 ; i< evens.size() -1; i++){
            System.out.print(evens.get(i)+ ", ");
        }
        if(evens.size() > 0) System.out.println(evens.get(evens.size() - 1)); else System.out.println("");
    }
    public void displayPerfectSquare(ArrayList perfectsquares){
        System.out.println("Number is Perfect Square: ");
        for(int i=0 ; i< perfectsquares.size() -1; i++){
            System.out.print(perfectsquares.get(i)+ ", ");
        }
        if(perfectsquares.size() > 0) System.out.println(perfectsquares.get(perfectsquares.size()-1)); else System.out.println("");
    }
    public void displayInfinitySolution(){
        System.out.println("The equation have infinity solutions.");
    }
    public void displayNoSolution(){
        System.out.println("The equation have no solution.");
    }
}
