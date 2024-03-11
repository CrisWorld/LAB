/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.AccountHash;
import views.GlobalView;

/**
 *
 * @author quoch
 */
public class MainController extends Menu{
    AuthenticationController controller;
    public MainController(String title, String[] options, AuthenticationController controller){
        super(title, options);
        this.controller = controller;
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
            {
                try {
                    controller.login("VN");
                } catch (Exception ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 2:
            {
                try {
                    controller.login("EN");
                } catch (Exception ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;
            default:
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        String title = "-------Login Program-------";
        String[] options = new String[]{"Vietnamese", "English", "Exit"};
        GlobalView view = new GlobalView();
        AccountHash ach = new AccountHash();
        MainController main = new MainController(title, options, new AuthenticationController(view, ach));
        main.run();
    }
}
