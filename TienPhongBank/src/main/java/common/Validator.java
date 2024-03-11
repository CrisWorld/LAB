/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quoch
 */
public class Validator {
   public boolean min(String str, int min){
       return str.length() >= min;
   } 
   public boolean max(String str, int max){
       return str.length() <= max;
   }
   public boolean regex(String str, String regex){
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(str);
       return matcher.matches();
   }
}
