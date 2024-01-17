/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import models.OrderList;
import models.Product;

/**
 *
 * @author quoch
 */
public class ShopSystem {
    private OrderList orderList = new OrderList();
    private ArrayList<Product> fruits = new ArrayList<Product>();
    public ShopSystem(){
        fruits.add(new Product("TC1", 10, "Mango", "VietNam", 10));
        fruits.add(new Product("TC2", 10, "Banana", "VietNam", 10));
        fruits.add(new Product("TC3", 10, "Apple", "VietNam", 10));
        fruits.add(new Product("TC4", 10, "Lemon", "VietNam", 10));
    }
//    String id,int quanity, String name, String origin, double price
    public OrderList getOrderList(){
        return orderList;
    }
    public ArrayList<Product> getFruits(){
        return fruits;
    }
    public static void main(String[] args) {
        ShopSystem shop = new ShopSystem();
        String title = "Fruit Shop System";
        String[] options = new String[]{"Create Fruit", "View orders", "Shopping (for buyer)", "Exit"};
        MainController main = new MainController(title, options, shop);
        main.run();
    }
}
