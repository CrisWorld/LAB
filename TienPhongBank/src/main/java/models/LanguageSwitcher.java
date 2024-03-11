// -*- coding: utf-8 -*-
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author quoch
 */
public class LanguageSwitcher {
     private ResourceBundle messages;

    public void setLocale(String localeName) {
        Locale locale = new Locale(localeName);
        messages = ResourceBundle.getBundle("Language", locale);
    }

    public String getMessage(String key) {
        return messages.getString(key);
    }

    public static void main(String[] args) {
        LanguageSwitcher languageSwitcher = new LanguageSwitcher();

        // Default locale
        languageSwitcher.setLocale("en_US");

        // Example usage
        System.out.println(languageSwitcher.getMessage("greeting"));

        // Switch to another locale
        languageSwitcher.setLocale("vi_VN");

        // Example usage after switching
        System.out.println(languageSwitcher.getMessage("account.number"));
        
    }
}
