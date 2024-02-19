/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WorkerHash {
    private HashMap<String, Worker> workerMap;

    public WorkerHash() {
        this.workerMap = new HashMap<>();
        initData();
    }
    
    public void initData(){
        
        workerMap.put("001", new Worker("001", "Nguyen Hoang Quoc", "VietNam", 1000));
        workerMap.put("002", new Worker("002", "Tran Thi Anh", "VietNam", 1200));
        workerMap.put("003", new Worker("003", "John Smith", "USA", 1500));
        workerMap.put("004", new Worker("004", "Maria Rodriguez", "Spain", 1100));
        workerMap.put("005", new Worker("005", "Li Wei", "China", 1300));
        workerMap.put("006", new Worker("006", "Yuki Tanaka", "Japan", 1600));
        workerMap.put("007", new Worker("007", "Anna Petrova", "Russia", 1400));
        workerMap.put("008", new Worker("008", "Ahmed Mahmoud", "Egypt", 900));
        workerMap.put("009", new Worker("009", "Luisa Martinez", "Mexico", 1000));
        workerMap.put("010", new Worker("010", "Kumar Singh", "India", 1100));
    }

    public boolean addWorker(Worker worker) throws Exception {
        checkDatabaseExistence();

        if (worker == null) {
            throw new Exception("Data does not exist");
        }

        if (workerMap.containsKey(worker.getCode())) {
            throw new Exception("Worker code [" + worker.getCode() + "] is duplicate");
        }

        workerMap.put(worker.getCode(), worker);
        return true;
    }
    
    public Worker getWorkerByCode(String code) throws Exception{
        checkDatabaseExistence();
        checkWorkerExistence(code);
        Worker worker = workerMap.get(code);
        if(worker == null) throw new Exception("Data doesn't exist");
        return worker;
    }
    
    public void checkWorkerExistence(String code) throws Exception{
        if (!workerMap.containsKey(code)) {
            throw new Exception("Worker code doesn't exist");
        }
    }
    public void checkDatabaseExistence() throws Exception {
        if (workerMap == null) {
            throw new Exception("Database does not exist");
        }
    }
    
    public ArrayList<Worker> getWorkerArrayList() throws Exception{
        checkDatabaseExistence();
        Collection<Worker> values = workerMap.values();
        ArrayList<Worker> result = new ArrayList<>(values); 
        return result;
    }
}
