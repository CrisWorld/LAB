/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import models.Product;
import models.Validator;

/**
 *
 * @author quoch
 */
public class OrderView {
    public void displayOrders(Hashtable<String,ArrayList<Product>> orderList){
        Enumeration<String> customers = orderList.keys();
        while(customers.hasMoreElements()){
            String customer = customers.nextElement();
            System.out.println("Customer: "+customer);
            System.out.format("%-20s %-15s %-15s %-15s\n", "++Product++", "++Quantity++", "++Price++","++Amount++");
            double total = 0;
            ArrayList<Product> products = orderList.get(customer);
            for(int i=0; i< products.size(); i++){
                Product p = products.get(i);
                System.out.format("%-20s %-15s %-15s %-15s\n", (i+1) + "." +  p.getName(), p.getQuanity(),p.getPrice()+"$", p.getAmount()+"$");
                total += p.getAmount();
            }
            System.out.println("Total: "+total+"$\n");
        }
    }
    public void displayOrder(String customerName, ArrayList<Product> products){
        System.out.println("Customer: "+customerName);
        System.out.format("%-20s %-15s %-15s %-15s\n", "++Product++", "++Quantity++", "++Price++","++Amount++");
        double total = 0;
        for(int i=0; i< products.size(); i++){
            Product p = products.get(i);
            System.out.format("%-20s %-15s %-15s %-15s\n", (i+1) + "." +  p.getName(), p.getQuanity(),p.getPrice()+"$", p.getAmount()+"$");
            total += p.getAmount();
        }
        System.out.println("Total: "+total+"$\n");
    }
    public Product getItem(ArrayList<Product> products){
        Validator validator = new Validator(products);
        Scanner sc;
        int item, quantity;
        do{
            System.out.println("Please select items(number): ");
            sc = new Scanner(System.in);
            item = sc.nextInt();
            if(validator.isEnough(item, 1, products.size())) break;
            else System.out.println("Invalid number");
        } while(true);
            System.out.println("You selected: " + products.get(item-1).getName());
        do{
            System.out.println("Please enter quantity(number): ");
            sc = new Scanner(System.in);
            quantity = sc.nextInt();
            if(quantity > 0) break;
            else System.out.println("Invalid number");
        } while(true);
        return new Product(products.get(item-1), quantity);
    }
    public String getCustomerName(){
        System.out.println("Please your name: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }
    public boolean wantToOrder(){
       System.out.println("Do you want to order now (Y/N)?");
       Scanner sc = new Scanner(System.in);
       if(sc.nextLine().toUpperCase().trim().charAt(0) == 'Y') return true;
       return false;
   }
}
