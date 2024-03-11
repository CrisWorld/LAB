/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountHash {
    private HashMap<String, Account> accountMap;

    public AccountHash() {
        this.accountMap = new HashMap<>();
        try {
            initData();
        } catch (Exception ex) {
            Logger.getLogger(AccountHash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void initData() throws Exception{
        accountMap.put("1234567890", new Account("1234567890", "Password1"));
        accountMap.put("9876543210", new Account("9876543210", "SecurePwd1"));
        accountMap.put("1112233445", new Account("1112233445", "StrongPass1"));
    }

    public boolean addAccount(Account account) throws Exception {
        checkDatabaseExistence();

        if (account == null) {
            throw new Exception("Data does not exist");
        }

        if (accountMap.containsKey(account.getAccountNumber())) {
            throw new Exception("Account code [" + account.getAccountNumber() + "] is duplicate");
        }

        accountMap.put(account.getAccountNumber(), account);
        return true;
    }

    public boolean updateAccount(Account account) throws Exception {
        checkDatabaseExistence();

        if (account == null) {
            throw new Exception("Data does not exist");
        }

        checkAccountExistence(account.getAccountNumber());

        accountMap.put(account.getAccountNumber(), account);
        return true;
    }

    public boolean deleteAccount(Account account) throws Exception {
        checkDatabaseExistence();
        
        if (account == null) {
            throw new Exception("Data does not exist");
        }
        
        checkAccountExistence(account.getAccountNumber());
        
        accountMap.remove(account.getAccountNumber());
        return true;
    }
    
    public ArrayList<Account> getAccountArrayList() throws Exception{
        checkDatabaseExistence();
        Collection<Account> values = accountMap.values();
        ArrayList<Account> result = new ArrayList<>(values); 
        return result;
    }
    
    public Account getAccountByAN(String code) throws Exception{
        checkDatabaseExistence();
        checkAccountExistence(code);
        Account account = accountMap.get(code);
        return account;
    }
    
    private void checkAccountExistence(String code) throws Exception{
        if (!accountMap.containsKey(code)) {
            throw new Exception("Account code doesn't exist");
        }
    }
    private void checkDatabaseExistence() throws Exception {
        if (accountMap == null) {
            throw new Exception("Database does not exist");
        }
    }
}
