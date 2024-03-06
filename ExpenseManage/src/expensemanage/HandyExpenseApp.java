/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expensemanage;

import controllers.HandyExpenseController;
import java.util.ArrayList;
import models.Expense;
import views.HandyExpenseView;

/**
 *
 * @author sewrf
 */
public class HandyExpenseApp {
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        HandyExpenseView view = new HandyExpenseView();
        HandyExpenseController controller = new HandyExpenseController(expenses, view);

        controller.run();
    }
}

