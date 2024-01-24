/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class SimpleEquation {
    private double a,b;

    public SimpleEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public Byte checkSolution(){
        if(a == 0 && b ==0) return 1;
        else if(a == 0 && b != 0) return 0;
        return -1;
    }
    
    public Double getSolution(){
        if(a != 0) return -b/a;
        return null;
    }
}
