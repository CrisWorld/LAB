/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public byte checkSolution(){
        double denta = Math.pow(b, 2) - 4*a*c;
        if(denta >= 0) return 1;
        return 0;
    }
    public double[] getSolutions(){
        if(checkSolution() == 1){
            double denta = Math.pow(b, 2) - 4*a*c;
            double x1 = (Math.sqrt(denta) - b)/(2*a);
            double x2 = (-Math.sqrt(denta) - b)/(2*a);
            return new double[]{x1, x2};
        }
        return null;
    }
}
