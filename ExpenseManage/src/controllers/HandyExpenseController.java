/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.Scanner;
import models.Expense;
import views.HandyExpenseView;

/**
 *
 * @author sewrf
 */

public class HandyExpenseController {
    private ArrayList<Expense> expenses;
    private HandyExpenseView view;

    public HandyExpenseController(ArrayList<Expense> expenses, HandyExpenseView view) {
        this.expenses = expenses;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    view.displayAllExpenses(expenses);
                    break;
                case 3:
                    deleteExpense();
                    break;
                case 4:
                    view.displayQuitMessage();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private void addExpense() {
        Expense newExpense = view.readExpenseInput();
        newExpense = new Expense(expenses.size() + 1, newExpense.getDate(), newExpense.getAmount(), newExpense.getContent());
        expenses.add(newExpense);
        System.out.println("Expense added successfully with ID: " + newExpense.getId());
    }

    private void deleteExpense() {
        int idToDelete = view.readExpenseIdToDelete();
        boolean isDeleted = false;

        for (Expense expense : expenses) {
            if (expense.getId() == idToDelete) {
                expenses.remove(expense);
                System.out.println("Expense with ID " + idToDelete + " deleted successfully.");
                isDeleted = true;
                break;
            }
        }

        if (!isDeleted) {
            view.displayDeleteFailMessage();
        }
    }
}

