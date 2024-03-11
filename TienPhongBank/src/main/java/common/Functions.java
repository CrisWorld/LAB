/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.security.SecureRandom;

/**
 *
 * @author quoch
 */
public class Functions {
    public String generateRandomString(int size){
        final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if(size <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        StringBuilder randomString = new StringBuilder(size);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }
}
