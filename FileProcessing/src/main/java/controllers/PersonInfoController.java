/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.FileHandler;
import models.Person;
import view.GeneralView;

/**
 *
 * @author quoch
 */
public class PersonInfoController {
    ArrayList<Person> list;

    public PersonInfoController() {
        this.list = new ArrayList<>();
    }
    
    public void getPerson() throws Exception{
        GeneralView view = new GeneralView();
        ArrayList data = view.getPathAndMoney();
        FileHandler file = new FileHandler((String) data.get(0));
        ArrayList<String> result = file.readFile();
        for(String str: result){
            String[] data1 = str.split(";");
            try{
                list.add(new Person(data1[0], data1[1], Double.parseDouble(data1[2])));
            } catch (Exception e){
                list.add(new Person(data1[0], data1[1], 0));
            }
        }
        
        // filter
        ArrayList<Person> dataFiltered = new ArrayList<>();
        for(Person p: list){
            if(p.getSalary() >= (double) data.get(1)) dataFiltered.add(p);
        }
        
        Person min = findMin(dataFiltered);
        Person max = findMax(dataFiltered);
        view.displayResult(min != null ? min.getName() : "", max != null ? max.getName() : "", dataFiltered);
    }
    
    public Person findMin(ArrayList<Person> list){
        Person min;
        if(list.size() == 0) return null; else min = list.get(0);
        for(Person p: list){
            if(p.getSalary() < min.getSalary()) min = p;
        }
        return min;
    }
    
    public Person findMax(ArrayList<Person> list){
        Person max;
        if(list.size() == 0) return null; else max = list.get(0);
        for(Person p: list){
            if(p.getSalary() > max.getSalary()) max = p;
        }
        return max;
    }
}
