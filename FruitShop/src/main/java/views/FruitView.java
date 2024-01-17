/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import models.Product;
import models.Validator;

/**
 *
 * @author quoch
 */
public class FruitView {
   public void disPlayFruits(ArrayList<Product> fruits){
        Formatter fmt = new Formatter();
        System.out.format("%-10s %-20s %-15s %-15s", "++Item++", "++Fruit Name++", "++Origin++","++Price++");
        System.out.println("");
        for(int i=0; i< fruits.size(); i++){
            Product p = fruits.get(i);
            System.out.format("%-10s %-20s %-15s %-15s", i+1, p.getName(), p.getOrigin(),p.getPrice()+"$");
            System.out.println("");
        }
   } 
   public Product getFruit(ArrayList<Product> products){
       Validator validator = new Validator(products);
       Scanner sc;
       System.out.println("Create a new fruit");
       String fruitID, fruitName, fruitOrigin;
       double fruitPrice;
       do{
           System.out.println("Enter fruid id:");
           sc = new Scanner(System.in);
           fruitID = sc.nextLine();
           if(validator.isExistedFruit(fruitID)) System.out.println("Fruit ID is existed");
           else break;
       }
       while(true);
       System.out.println("Fruit name: ");
       sc = new Scanner(System.in);
       fruitName = sc.nextLine();
       System.out.println("Fruit origin: ");
       sc = new Scanner(System.in);
       fruitOrigin = sc.nextLine();
       do{
           System.out.println("price: ");
           fruitPrice = sc.nextDouble();
           if(fruitPrice <= 0) System.out.println("Invalid number");
           else break;
       } while(true);
       return new Product(fruitID, fruitName, fruitOrigin, fruitPrice);
   }
   public boolean isCountinue(){
       System.out.println("Do you want to continue (Y/N)?");
       Scanner sc = new Scanner(System.in);
       if(sc.nextLine().toUpperCase().trim().charAt(0) == 'Y') return true;
       return false;
   }
}
