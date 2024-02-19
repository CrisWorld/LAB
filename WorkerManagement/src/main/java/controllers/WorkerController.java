/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.WorkerHash;
import views.GeneralView;

/**
 *
 * @author quoch
 */
public class WorkerController extends Menu{
    private WorkerHash wHash;
    
    public WorkerController(){
        wHash = new WorkerHash();
    }
    
    public WorkerController(WorkerHash wHash) {
        this.wHash = wHash;
    }
    
    public void addWorker(){
        GeneralView view = new GeneralView();
//        Worker worker = view.getWorker();
        try{
//        wHash.checkWorkerExistence(worker.getCode());
            wHash.addWorker(worker);
        } catch(Exception e){
            view.displayMessage("Worker was existed in database!");
        }
    }
    
    public void upSalary(){
        GeneralView view = new GeneralView();
        try{
//        Code code = view.getCode();
//        wHash.checkWorkerExistence(code);
//        Worker worker = wHash.getWorkerByCode(code);
//        double salary = view.getUpSalary();
//        if(salary <= worker.getSalary) view.showMessage("Error Salary");
//        else worker.setSalary(salary);
        } catch(Exception e){
            view.displayMessage("Worker was existed in database!");
        }
    }
    public void downSalary(){
        GeneralView view = new GeneralView();
        try{
//        Code code = view.getCode();
//        wHash.checkWorkerExistence(code);
//        Worker worker = wHash.getWorkerByCode(code);
//        double salary = view.getUpSalary();
//        if(salary >= worker.getSalary) view.showMessage("Error Salary");
//        else worker.setSalary(salary);
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
               view.displayInformationSalary(wHash.getWorkerArrayList());
               break;
           default:
               System.exit(0);
       }
    }
}
