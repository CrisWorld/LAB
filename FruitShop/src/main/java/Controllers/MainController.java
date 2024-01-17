/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import java.util.Formatter;
import models.OrderList;
import models.Product;
import models.Validator;
import views.FruitView;
import views.Menu;
import views.OrderView;

/**
 *
 * @author quoch
 */
public class MainController extends Menu{
    ShopSystem shopSystem;
    public MainController(String title, String[] options, ShopSystem system){
        super(title, options);
        this.shopSystem = system;
    }
    @Override
    public void execute(int n) {
        FruitView fruitView = new FruitView();
        OrderView orderView = new OrderView();
        switch(n){
            case 1:
                do{
                    fruitView.disPlayFruits(shopSystem.getFruits());
                    Product p = fruitView.getFruit(shopSystem.getFruits());
                    shopSystem.getFruits().add(p);
                    if(!fruitView.isCountinue()) break;
                } while(true);
                break;
            case 2:
                orderView.displayOrders(shopSystem.getOrderList().getHashTable());
                break;
            case 3:
                ArrayList<Product> fruitSelecteds = new ArrayList<Product>();
                String customerName;
                do{
                    if(shopSystem.getFruits().size() == 0) {
                        System.out.println("Nothing to buy");
                        break;
                    }
                    fruitView.disPlayFruits(shopSystem.getFruits());
                    if(shopSystem.getFruits().size() > 0) {
                        Product fruit = orderView.getItem(shopSystem.getFruits());
                        Validator validator = new Validator(fruitSelecteds);
                        if(validator.isExistedFruit(fruit.getId())){
                            for(Product f: fruitSelecteds){
                                if(f.getId().toUpperCase().trim().equals(fruit.getId().toUpperCase().trim())){
                                    f.setQuanity(f.getQuanity()+fruit.getQuanity());
                                    break;
                                }
                            }
                        } else fruitSelecteds.add(fruit);
                    }
                    if(orderView.wantToOrder()) {
                        customerName = orderView.getCustomerName();
                        shopSystem.getOrderList().getHashTable().put(customerName, fruitSelecteds);
                        orderView.displayOrder(customerName, fruitSelecteds);
                        break;
                    }
                } while(true); 
                break;
            case 4: 
                System.exit(1);
                break;
        }
    }
    
}
