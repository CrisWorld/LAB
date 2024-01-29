/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author quoch
 */
public class MainMenu extends Menu{
    private CalculatorController calculator = new CalculatorController();
    public MainMenu(String title, String[] options){
        super(title, options);
    }
    @Override
    public void execute(int n) {
        
        switch(n){
            case 1:
                calculator.runNormalCalculator();
                break;
            case 2:
                calculator.runBMICalculator();
                break;
            default:
                System.exit(0);
        }
    }   
    public static void main(String[] args) {
       String title = "=======Calculator Program======";
       String[] options = new String[]{
           "Normal Calculator", "BMI Calculator", "exit"
       };
       MainMenu menu = new MainMenu(title, options);
       menu.run();
    }
}
