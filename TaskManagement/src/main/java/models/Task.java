/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author quoch
 */
class TaskType {
    private int taskTypeId;
    private String name;

    public TaskType(int taskTypeId, String name) {
        this.taskTypeId = taskTypeId;
        this.name = name;
    }
    
    public int getTaskTypeID(){
        return this.taskTypeId;
    }
    
    public String getName(){
        return this.name;
    }
}

public class Task {
    private int taskId;
    private TaskType taskType;
    private String requirementName;
    private Date date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    public Task(int taskId, TaskType taskType, String requirementName, String date, double planFrom, double planTo, String assignee, String reviewer) throws ParseException {
        this.taskId = taskId;
        this.taskType = taskType;
        this.requirementName = requirementName;
        this.date = new SimpleDateFormat("dd-MM-yyyy").parse(date);
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskType() {
        return taskType.getName();
    }

    public String getRequirementName() {
        return requirementName;
    }

    public Date getDate() {
        return date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }
    
}

