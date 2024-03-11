/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import common.Validator;

/**
 *
 * @author quoch
 */
public class Account {
    private String accountNumber;
    private String password;

    public Account(String accountNumber, String password) throws Exception {
        setAccountNumber(accountNumber);
        setPassword(password);
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) throws Exception {
        Validator validator = new Validator();
        if(validator.regex(accountNumber, "\\d{10}")) this.accountNumber = accountNumber;
        else throw new Exception("Account number must be 10 digit");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        Validator validator = new Validator();
        if(validator.min(password, 8) && validator.regex(password, "^[a-zA-Z0-9]+$")) this.password = password;
        else throw new Exception("Password is at least 8 letter and contain at least 1 lowercase and 1 uppercase");
    }
    
}
