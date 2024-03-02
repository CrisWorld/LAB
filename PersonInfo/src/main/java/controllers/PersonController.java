/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Scanner;
import models.Person;
import views.PersonView;
/**
 *
 * @author quoch
 */
public class PersonController {
    PersonView view;
    Person[] personList;
    public PersonController(PersonView view){
        this.view = view;
        personList = new Person[100];
    }
    
    public void addPersons(Person[] persons){
        int end = 0;
        for(end = 0; end < persons.length; end++ ){
            if(persons[end] == null) break;
        }
        for (Person person : persons) {
            personList[end] = person;
            end++;
        }
    }
    
    // Bubble sort for sorting persons by salary
    public static Person[] sortBySalary(Person[] persons) {
        int n = persons.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (persons[j].getSalary() > persons[j + 1].getSalary()) {
                    // swap temp and persons[i]
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        return persons;
    }
    
    public void getPersons(){
        
        Person[] persons = view.getPersons();
        
        // Display information of entered persons
        for (Person person : persons) {
            view.displayPersonInfo(person);
        }
        // Sort persons by salary
        addPersons(persons);
        personList = sortBySalary(personList);
    }
    
    public void displayAllPerson(){
        view.showMessage("Information of Persons after sorting by salary:");
        view.displayAllPerson(personList);
    }
}