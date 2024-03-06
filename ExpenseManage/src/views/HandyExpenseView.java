/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import models.Expense;

/**
 *
 * @author sewrf
 */
public class HandyExpenseView {
    public void displayMenu() {
        System.out.println("=======Handy Expense program======");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
    }

    public Expense readExpenseInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------- Add an expense--------");
       
        String date;
        do {
            System.out.print("Enter Date: ");
            date = scanner.nextLine();
        } while (!isValidDateFormat(date));
        
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter Content: ");
        String content = scanner.nextLine();

        return new Expense(0, date, amount, content); 
    }
    private boolean isValidDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            Date parsedDate = dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in dd/mm/yyyy format.");
            return false;
        }
    }


    public int readExpenseIdToDelete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Delete an expense------");
        System.out.print("Enter ID: ");
        return scanner.nextInt();
    }

    public void displayAllExpenses(ArrayList<Expense> expenses) {
        System.out.println("---------Display all expenses------------");
        System.out.printf("%-5s %-15s %-15s %-15s\n", "ID", "Date", "Amount", "Content");

        double totalAmount = 0;

        for (Expense expense : expenses) {
            System.out.printf("%-5d %-15s %-15.2f %-15s\n",
                    expense.getId(), expense.getDate(), expense.getAmount(), expense.getContent());
            totalAmount += expense.getAmount();
        }

        System.out.println("Total: " + totalAmount);
    }

    public void displayDeleteFailMessage() {
        System.out.println("Delete an expense fail");
    }

    public void displayQuitMessage() {
        System.out.println("Goodbye!");
    }
}