/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author quoch
 */
public class TaskManager {
    List<TaskType> taskTypes;
    List<Task> tasks;

    public TaskManager() {
        this.taskTypes = new ArrayList<>();
        this.tasks = new ArrayList<>();

        // Initialize task types
        taskTypes.add(new TaskType(1, "Code"));
        taskTypes.add(new TaskType(2, "Test"));
        taskTypes.add(new TaskType(3, "Design"));
        taskTypes.add(new TaskType(4, "Review"));
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(int taskId) throws Exception{
        if(tasks.size() == 0) throw new Exception("Task list is empty");
        Iterator<Task> iterator = tasks.iterator();
        boolean flag = true;
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getTaskId() == taskId) {
                iterator.remove();
                flag = false;
            }
        }
        if(flag) throw new Exception("Couldn't find the task that have ID is "+taskId);
    }
    
    public TaskType getTaskType(int ID) throws Exception{
        if(taskTypes.size() == 0) throw new Exception("Task type list is empty");
        for(TaskType tt: taskTypes){
            if(tt.getTaskTypeID() == ID) return tt;
        }
        throw new Exception("Couldn't find this task type have the ID is "+ID);
    }
    
    public int generateID(){
        if(tasks.size() == 0) return 0;
        int lastIndex = tasks.size() - 1;
        Task lastTask = tasks.get(lastIndex);
        return lastTask.getTaskId() + 1;
    }
    
    public List<Task> getTasks(){
        return this.tasks;
    }
}
