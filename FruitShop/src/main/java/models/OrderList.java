/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author quoch
 */
public class OrderList {
    private Hashtable<String,ArrayList<Product>> hashTable;

    public OrderList(Hashtable<String, ArrayList<Product>> hashTable) {
        this.hashTable = hashTable;
    }
    public OrderList() {
        this.hashTable = new Hashtable<String, ArrayList<Product>>();
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product("TC1", 10, "Banana", "Vietnam", 20));
        list.add(new Product("TC1", 10, "Apply", "Vietnam", 20));
        list.add(new Product("TC1", 10, "Watermelon", "Vietnam", 20));
        list.add(new Product("TC1", 10, "Mango", "Vietnam", 20));
        list.add(new Product("TC1", 10, "Cherry", "Vietnam", 20));
        hashTable.put("Hoang Quoc",list);
        hashTable.put("Hoang Long",list);
    }
    public Hashtable<String,ArrayList<Product>> getHashTable(){
        return hashTable;
    }
    public ArrayList<Product> getOrder(String customer){
        return hashTable.get(customer);
    }
}
