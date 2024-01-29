/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.BMI;
import models.Calculator;
import models.InputProcessor;
import models.Validation;
import views.BMIView;
import views.CalculatorView;

/**
 *
 * @author quoch
 */
public class CalculatorController {
    private double tempMemory = 0;

    public void runNormalCalculator(){
        System.out.println("----- Normal Calculator -----");
        boolean flag = true;
        do{
            flag = calculate(tempMemory);
        } while(flag);
        clearMemory();
    }
    public void clearMemory(){
        tempMemory = 0;
    }
    private boolean calculate(double num) {
        Calculator calculatorModel = new Calculator();
        InputProcessor inputProcessorModel = new InputProcessor();
        CalculatorView calculatorView = new CalculatorView();
        try {
            // Process input from View
            char inputOperator = calculatorView.getOperatorInput();
            if(inputOperator == '=') {
                calculatorView.setResult(String.valueOf(tempMemory), false);
                return false;
            }
            String inputNumber = calculatorView.getNumberInput();

            inputProcessorModel.processInput(inputNumber, inputOperator);

            double number = inputProcessorModel.getNumber();
            char operator = inputProcessorModel.getOperator();

            double result = calculatorModel.calculate(num, number, operator);
            // Update View with the result
            calculatorView.setResult(String.valueOf(result), true);
            tempMemory = result;
        } catch (Exception ex) {
            calculatorView.displayErrorMessage(ex.getMessage());
            return true;
        }
        return true;
    }
    public void runBMICalculator(){
        BMIView view = new BMIView();
        Validation validator = new Validation();
        BMI bmi = new BMI();
        double m = 1, kg = 0;
        try{
            // get weight
            String numberWeight = view.getWeight();
            if(validator.isValidNumber(numberWeight)) kg = Double.parseDouble(numberWeight);

            // get height 
            String numberHeight = view.getHeight();
            if(validator.isValidNumber(numberHeight)) m = Double.parseDouble(numberHeight);

            // show result
            view.setResult(m, kg, bmi.calculateBMI(kg, m));
        }catch(Exception ex){
            view.displayErrorMessage("BMI is digit");
        }
    }
}
