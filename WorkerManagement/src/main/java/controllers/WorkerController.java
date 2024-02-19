/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.Worker;
import models.WorkerHash;
import views.GeneralView;

/**
 *
 * @author quoch
 */
public class WorkerController extends Menu{
    private WorkerHash wHash;
    
    public WorkerController(String title, String[] options){
        super(title, options);
        wHash = new WorkerHash();
    }
    
    public void addWorker(){
        GeneralView view = new GeneralView();
        Worker worker = view.getWorker();
        try{
            if(wHash.getWorkerByCode(worker.getCode()) == null) wHash.addWorker(worker);
            else throw new Exception();
        } catch(Exception e){
            System.out.println(e.getMessage());
            view.displayMessage("Worker was existed in database!");
        }
    }
    
    public void upSalary(){
        GeneralView view = new GeneralView();
        try{
        String code = view.getCode();
        wHash.checkWorkerExistence(code);
        Worker worker = wHash.getWorkerByCode(code);
        double salary = view.getUpSalary();
        if(salary <= worker.getSalary()) view.displayMessage("Error Salary");
        else worker.changeSalary(salary);
        } catch(Exception e){
            System.out.println(e.getMessage());
            view.displayMessage("Worker doesn't exist in database!");
        }
    }
    public void downSalary(){
        GeneralView view = new GeneralView();
        try{
        String code = view.getCode();
        wHash.checkWorkerExistence(code);
        Worker worker = wHash.getWorkerByCode(code);
        double salary = view.getDownSalary();
        if(salary >= worker.getSalary()) view.displayMessage("Error Salary");
        else worker.changeSalary(salary);
        } catch(Exception e){
            view.displayMessage("Worker was existed in database!");
        }
    }

    @Override
    public void execute(int n) {
       switch(n){
           case 1:
               addWorker();
               break;
           case 2:
               upSalary();
               break;
           case 3:
               downSalary();
               break;
           case 4:
               GeneralView view = new GeneralView();
                try {
                    view.displayInformationSalary(wHash.getWorkerArrayList());
                } catch (Exception ex) {
                    Logger.getLogger(WorkerController.class.getName()).log(Level.SEVERE, null, ex);
                }
               break;

           default:
               System.exit(0);
       }
    }
    
    public static void main(String[] args) {
        String title = "======== Worker Management =========";
        String[] options = {"Add Worker", "Up Salary", "Down Salary", "Display Information Salary", "Exit"};
        WorkerController c = new WorkerController(title, options);
        c.run();
    }   
}
