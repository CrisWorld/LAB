/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quoch
 */
public class Validator {
    
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
    public boolean isNumber(String num){
        try{
            Double value = Double.parseDouble(num);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    public boolean isPerfectSquare(double a){
        if(a == 0) return false;
        return Math.floor(Math.sqrt(a)) == Math.sqrt(a);
    }
}
