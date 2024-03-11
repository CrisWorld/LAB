/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import common.Functions;
import common.Validator;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class GlobalView {
    private String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
    public void showMessage(String msg){
        System.out.println(msg);
    }
    
    public String[] getAccount(){
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        String accountNumber, password, captcha, userCaptcha;
        do{
            if(mode.equals("VN")) System.out.println("So tai khoan: ");
            else if(mode.equals("EN")) System.out.println("Account number");
            accountNumber = scanner.nextLine();
            if(validator.regex(accountNumber, "\\d{10}")) break;
            else {
                if(mode.equals("VN")) System.out.println("So tai khoan phai la 1 so va phai co 10 chu so");
                else if(mode.equals("EN")) System.out.println("Account number must is a number and must have 10 digits");
            }
        } while(true);
        do{
            if(mode.equals("VN")) System.out.println("Mat khau: ");
            else if(mode.equals("EN")) System.out.println("Password: ");
            password = scanner.nextLine();
            if(validator.max(password, 31) && validator.min(password, 8) && validator.regex(password, "^(?=.*[a-zA-Z])(?=.*\\d).+$")) break;
            else{
                if(mode.equals("VN")) System.out.println("Mat khau phai trong khoang 8-31 ky tu va phai chua ky tu va so");
                else if(mode.equals("EN")) System.out.println("Password must be between 8 and 31 characters and must be alphanumeric");
            }
        } while(true);
        do{
            Functions function = new Functions();
            captcha = function.generateRandomString(5);
            System.out.println("Captcha: "+captcha);
            userCaptcha = scanner.nextLine();
            if(captcha.equals(userCaptcha)) break;
            else {
                if(mode.equals("VN")) System.out.println("Captcha sai");
                else if(mode.equals("EN")) System.out.println("Captcha incorrect");
            }
        } while(true);
        return new String[]{accountNumber, password};
    }
}
