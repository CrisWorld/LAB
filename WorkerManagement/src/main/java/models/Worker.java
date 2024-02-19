/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author quoch
 */
public class Worker {
    private String name, code, workLocation;
    private int age;
    private double salary;
    private ArrayList<History> histories;
    
    public Worker(String code, String name, String workLocation, double salaray, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.workLocation = workLocation;
        this.salary = salaray;
        histories = new ArrayList<History>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    
    public void changeSalary(double salary){
        histories.add(new History(LocalDate.now(), salary, salary > this.salary ? "UP" : "DOWN"));
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }

    public ArrayList<History> getInformationHistory() {
        return this.histories;
    }

    public int getAge() {
        return age;
    }
    
}
