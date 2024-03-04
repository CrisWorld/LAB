/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quoch
 */
public class StringAnalyzer {
    private String inputString;
    public StringAnalyzer(String inputString){
        this.inputString = inputString;
    }
    public StringAnalyzer(){
    }
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getAllCharacters() {
        return inputString;
    }

    public String getUppercaseCharacters() {
        return inputString.replaceAll("[^A-Z]", "");
    }

    public String getLowercaseCharacters() {
        return inputString.replaceAll("[^a-z]", "");
    }

    public List<Integer> getAllNumbers() {
        List<Integer> numbers = new ArrayList<>();
        boolean flag = false;
        String temp = "";
        for (char c : inputString.toCharArray()) {
            if(!flag && Character.isDigit(c)) {
                flag = true;
            }
            if (Character.isDigit(c)) {
                temp += String.valueOf(c);                
            }
            if(flag && !Character.isDigit(c)){
                numbers.add(Integer.parseInt(temp));
                flag = false;
//                System.out.println(temp);
                temp = "";
            }
        }
        if(!temp.equals("")) numbers.add(Integer.parseInt(temp));
        return numbers;
    }

    public List<Integer> getEvenNumbers() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : getAllNumbers()) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public List<Integer> getOddNumbers() {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : getAllNumbers()) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public List<Integer> getPerfectSquareNumbers() {
        List<Integer> squareNumbers = new ArrayList<>();
        for (int number : getAllNumbers()) {
            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                squareNumbers.add(number);
            }
        }
        return squareNumbers;
    }

    public String getSpecialCharacters() {
        return inputString.replaceAll("[\\w\\s]", "");
    }
}
