/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataformat;

import controllers.ValidatorController;
import java.util.Scanner;
import models.ValidatorModel;
import views.ValidatorView;

/**
 *
 * @author sewrf
 */

public class Main {
    public static void main(String[] args) {
        ValidatorModel model = new ValidatorModel();
        ValidatorView view = new ValidatorView();
        ValidatorController controller = new ValidatorController(model, view);

        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        String email;
        String date;
        while (true) {
            view.showInputPrompt(1);
            phoneNumber = scanner.nextLine();
            boolean flag = true;
            if (!phoneNumber.matches("\\d+")) {
                view.showErrorMessage(1);
                flag = false;
            }
            if (phoneNumber.length() != 10) {
                view.showErrorMessage(1);
                flag = false;
            }
            if(flag == true) {
                break;
            }
        }
        while(true){
            view.showInputPrompt(2);
            email = scanner.nextLine();
            boolean flag = true;
            if (!model.validateEmail(email)) {
                view.showErrorMessage(2);
                flag = false;
            }
            if(flag == true) {
            break;}
        }
            
        while(true){
            view.showInputPrompt(3);
            date = scanner.nextLine();
            boolean flag = true;
            if (!model.validateDate(date)) {
                view.showErrorMessage(3);
                flag = false;
            }
            if(flag == true){
                break;
            }
        }

        // Display success message
        System.out.println("All inputs are valid!");
    }
}
