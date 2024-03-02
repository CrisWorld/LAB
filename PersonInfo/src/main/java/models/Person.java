/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class Person {
    private String name;
    private String address;
    private double salary;

    // Constructors
    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    // Input function with validation
//    public static Person inputPersonInfo(String name, String address, String sSalary) {
//        Scanner scanner = new Scanner(System.in);
//        double salary = 0;
//
//        // Validate and input salary
//        boolean isValidInput = false;
//        do {
//            try {
//                salary = Double.parseDouble(sSalary);
//
//                if (salary < 0) {
//                    System.out.println("Salary must be a positive number.");
//                } else {
//                    isValidInput = true;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("You must input a valid number for salary.");
//            }
//
//            if (!isValidInput) {
//                System.out.print("Please input salary: ");
//                sSalary = scanner.nextLine();
//            }
//
//        } while (!isValidInput);
//
//        return new Person(name, address, salary);
//    }
}
