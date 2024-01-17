/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package models;

/**
 *
 * @author quoch
 */
public class Product {
    private int quanity;
    private String name, origin, id;
    private double price;
    public Product(String id,int quanity, String name, String origin, double price) {
        this.id = id;
        this.quanity = quanity;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }
    public Product(String id, String name, String origin, double price) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }
    public Product(Product p, int quanity) {
        this.id = p.getId();
        this.name = p.getName();
        this.origin = p.getOrigin();
        this.price = p.getPrice();
        this.quanity = quanity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getAmount(){
        return this.quanity*this.price;
    }


    public boolean equals(Product obj) {
        if(this.getId() == obj.getId()) return true;
        return false;
    }
    
}
