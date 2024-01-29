/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class Validation {
    public boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^';
    }
}
