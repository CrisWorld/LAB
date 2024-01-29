/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class Calculator {
    public double calculate(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            case '^':
                return Math.pow(number1, number2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
