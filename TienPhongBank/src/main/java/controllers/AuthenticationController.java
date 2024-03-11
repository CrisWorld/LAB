/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Account;
import models.AccountHash;
import views.GlobalView;

/**
 *
 * @author quoch
 */
public class AuthenticationController {
    GlobalView view;
    AccountHash database;
    public AuthenticationController(GlobalView view, AccountHash database) {
        this.view = view;
        this.database = database;
    }
    public void login(String mode) throws Exception{
        view.setMode(mode);
        String[] info = view.getAccount();
        Account account = database.getAccountByAN(info[0]);
        if(account != null && account.getPassword().equals(info[1])){
            view.showMessage("Dang nhap thanh cong");
        } else view.showMessage("Dang nhap that bai");
    }
}
