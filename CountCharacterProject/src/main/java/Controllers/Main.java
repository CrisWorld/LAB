/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scanner.nextLine();
        CountCharacterController countc = new CountCharacterController();
        LetterCountController countl = new LetterCountController();
        countc.run(input);
        countl.run(input);
    }
}
