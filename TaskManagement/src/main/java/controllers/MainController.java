/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.TaskManager;
import views.TaskView;

/**
 *
 * @author quoch
 */
public class MainController extends Menu{
    TaskController taskController = new TaskController(new TaskManager(), new TaskView());
    public MainController(String title, String[] options){
        super(title, options);
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
            {
                try {
                    taskController.addTask();
                } catch (Exception ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 2:
            {
                try {
                    taskController.deleteTask();
                } catch (Exception ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 3:
                taskController.showListTask();
                break;
            default:
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        String title = "========= Task program =========";
        String[] options = {"Add task", "Delete task", "Display task", "Exit"};
        MainController main = new MainController(title, options);
        main.run();
    }
}
