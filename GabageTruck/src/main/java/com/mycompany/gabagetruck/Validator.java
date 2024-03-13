/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gabagetruck;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quoch
 */
public class Validator {

    public boolean isEmail(String email){
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.matches();
    }
    public boolean isDate(String date){
        try{
            Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public boolean isDigit(String digits){
        for(int i=0; i<digits.length(); i++){
            if(!Character.isDigit(digits.charAt(i))) return false;
        }
        return true;
    }
    public boolean isEnough(int input, int min, int max){
        return input >= min && input <= max;
    }
    public boolean isEnough(double input, double min, double max){
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
}
