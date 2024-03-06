/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Task;
import models.TaskManager;
import views.TaskView;

/**
 *
 * @author quoch
 */
public class TaskController {
    TaskManager taskManager;
    TaskView taskView;
    public TaskController(TaskManager taskManager, TaskView taskView){
        this.taskManager = taskManager;
        this.taskView = taskView;
    }
    
    public void addTask() throws Exception{
        Task task = this.taskView.getTaskFromUser(taskManager);
        taskManager.addTask(task);
    }
    
    public void deleteTask() throws Exception{
        taskView.showMessage("---------Del Task------");
        int ID = taskView.getID();
        taskManager.deleteTask(ID);
    }
    
    public void showListTask(){
        List<Task> list = taskManager.getTasks();
        taskView.showListTask(list);
    }
}
