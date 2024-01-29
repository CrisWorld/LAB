/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class BMI {
    public String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height / 10000);
        return interpretBMI(bmi);
    }

    private String interpretBMI(double bmi) {
        if (bmi < 19) {
            return "Under-standard";
        } else if (bmi >= 19 && bmi <= 25) {
            return "Standard";
        } else if (bmi > 25 && bmi <= 30) {
            return "Overweight";
        } else if (bmi > 30 && bmi <= 40) {
            return "Fat";
        } else {
            return "Very fat";
        }
    }
}
