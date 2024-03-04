/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author sewrf
 */
public class ValidatorView {
    public void showInputPrompt(int inputIndex) {
        switch (inputIndex) {
            case 1:
                System.out.println("====== Validate Program ======");
                System.out.print("Phone number: ");
                break;
            case 2:
                System.out.print("Email: ");
                break;
            case 3:
                System.out.print("Date: ");
                break;
            default:
                break;
        }
    }

    public void showErrorMessage(int inputIndex) {
        switch (inputIndex) {
            case 1:
                System.out.println("Phone number must be 10 digits");
                break;
            case 2:
                System.out.println("Email must be in correct format");
                break;
            case 3:
                System.out.println("Date must be in dd/MM/yyyy format");
                break;
            default:
                break;
        }
    }
}
