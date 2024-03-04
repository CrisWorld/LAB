/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.ValidatorModel;
import views.ValidatorView;

/**
 *
 * @author sewrf
 */
public class ValidatorController {
    private ValidatorModel model;
    private ValidatorView view;

    public ValidatorController(ValidatorModel model, ValidatorView view) {
        this.model = model;
        this.view = view;
    }

    public void validatePhoneNumber(String phoneNumber) {
        if (!model.validatePhoneNumber(phoneNumber)) {
            view.showErrorMessage(1);
        }
    }

    public void validateEmail(String email) {
        if (!model.validateEmail(email)) {
            view.showErrorMessage(2);
        }
    }

    public void validateDate(String date) {
        if (!model.validateDate(date)) {
            view.showErrorMessage(3);
        }
    }
}