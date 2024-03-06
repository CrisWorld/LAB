/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author quoch
 */
import common.Validator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import models.Task;
import models.TaskManager;

public class TaskView {

    public int getID() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public Task getTaskFromUser(TaskManager taskManager) throws ParseException, Exception {
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();

        System.out.print("Requirement Name: ");
        String requirementName = scanner.nextLine();
        int taskType;
        do{
            System.out.print("Task Type (1: Code, 2: Test, 3: Design, 4: Review): ");
            taskType = scanner.nextInt();
        } while(!validator.isEnough(taskType, 1, 4));
        scanner.nextLine(); // Consume the newline character
        String date;
        do{
            System.out.print("Date (dd-MM-yyyy): ");
            date = scanner.nextLine();
        } while(!validator.isDate(date));
        double planFrom, planTo;
        do{
            System.out.print("Plan From: ");
            planFrom = scanner.nextDouble();
        } while(!validator.isEnough(planFrom, 0, 24));
        do{
            System.out.print("Plan To: ");
            planTo = scanner.nextDouble();
        } while(!validator.isEnough(planTo, planFrom, 24));
        scanner.nextLine(); // Consume the newline character

        System.out.print("Assignee: ");
        String assignee = scanner.nextLine();

        System.out.print("Reviewer: ");
        String reviewer = scanner.nextLine();

        return new Task(taskManager.generateID(), taskManager.getTaskType(taskType), requirementName, date, planFrom, planTo, assignee, reviewer);
    }
    
    public void showListTask(List<Task> taskList) {
        System.out.println("----------------------------------------- Task ---------------------------------------");
        System.out.format("%-4s%-15s%-15s%-15s%-10s%-15s%-15s%n", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        for (Task task : taskList) {
            System.out.format("%-4d%-15s%-15s%-15s%-10.1f%-15s%-15s%n", task.getTaskId(), task.getRequirementName(), task.getTaskType(), dateFormat.format(task.getDate()), task.getPlanTo() - task.getPlanFrom(), task.getAssignee(), task.getReviewer());
        }
    }
}
