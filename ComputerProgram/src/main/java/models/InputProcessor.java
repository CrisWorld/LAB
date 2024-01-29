/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class InputProcessor {
     private double number;
    private char operator;

    public void processInput(String inputNumber, char inputOperator) {
        Validation validator = new Validation();

        if (validator.isValidNumber(inputNumber)) {
            number = Double.parseDouble(inputNumber);
        } else {
            throw new IllegalArgumentException("Invalid number: " + inputNumber);
        }

        if (validator.isValidOperator(inputOperator)) {
            operator = inputOperator;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + inputOperator);
        }
    }

    public double getNumber() {
        return number;
    }

    public char getOperator() {
        return operator;
    }
}
