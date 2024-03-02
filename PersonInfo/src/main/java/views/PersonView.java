/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import static controllers.PersonController.sortBySalary;
import java.util.Scanner;
import models.Person;

/**
 *
 * @author quoch
 */
public class PersonView {
        // Display Person information
    public void displayPersonInfo(Person person) {
        System.out.println("Information of Person you have entered:");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
        System.out.println();
    }
    public Person[] getPersons(){
        Scanner scanner = new Scanner(System.in);
        double salary = 0;
        // Input information for three persons
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input Information of Person " + (i + 1));
            System.out.print("Please input name: ");
            String name = scanner.nextLine();
            System.out.print("Please input address: ");
            String address = scanner.nextLine();
            System.out.print("Please input salary: ");
            String sSalary = scanner.nextLine();
            boolean isValidInput = false;
            do {
                try {
                    salary = Double.parseDouble(sSalary);

                    if (salary < 0) {
                        System.out.println("Salary is greater than zero.");
                    } else {
                        isValidInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You must input digidt.");
                }

                if (!isValidInput) {
                    System.out.print("Please input salary: ");
                    sSalary = scanner.nextLine();
                }

            } while (!isValidInput);
            persons[i] = new Person(name, address, salary);
        }
        return persons;
    }
    
    public void showMessage(String msg){
        System.out.println(msg);
    }
    
    public void displayAllPerson(Person[] persons){
        for (Person person : persons) {
            displayPersonInfo(person);
        }
    }
}
