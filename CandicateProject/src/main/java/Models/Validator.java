/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
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
    public boolean isBirthDate(int date){
        LocalDate currentDate = LocalDate.now();
        if(date > 1900 && date < currentDate.getYear()){
            return true;
        }
        return false;
    }
    public boolean isPhone(String phone){
        if(phone.length() >= 10){
            for(int i= 0; i<phone.length(); i++){
                if(!Character.isDigit(phone.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
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
}
