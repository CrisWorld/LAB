/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quoch
 */
public class Validator {
    private ArrayList<Product> products;
    public Validator(ArrayList<Product> products){
        this.products = products;
    }
    public boolean isEnough(int input, int min, int max){
        return input >= min && input <= max;
    }
    public boolean isAlphabic(String input){
        for(int i=0; i < input.length(); i++){
            if(!Character.isLetter(input.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean isExistedFruit(String id){
        for(Product p: products){
            if(id.toUpperCase().trim().equals(p.getId().toUpperCase().trim()) ) return true;
        }
        return false;
    }
}
