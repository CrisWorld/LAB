/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author sewrf
 */
public class ValidatorModel {
    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    public boolean validateEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public boolean validateDate(String date) {
        return date.matches("\\d{2}/\\d{2}/\\d{4}");
    }
}