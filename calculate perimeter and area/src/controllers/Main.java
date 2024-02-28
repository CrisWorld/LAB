/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controllers;


import Views.GeneralView;
import models.Triangle;
import models.Circle;
import models.Rectangle;
import java.util.Scanner;


/**
 *
 * @author sewrf
 */


public class Main {
    public final GeneralView gv = new GeneralView();
    
    public void run(){{        
        System.out.println("=====Calculator Shape Program=====");
        Rectangle rectangle = gv.inputRectangle();
        Circle circle = gv.inputCircle();
        Triangle trigle = gv.inputTriangle();
        display(trigle, rectangle, circle);
    }}
    public void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }

    
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
}