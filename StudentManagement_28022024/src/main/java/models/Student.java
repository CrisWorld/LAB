/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class Student implements Comparable<Student> {
    private String name;
    private String classes;
    private double mark;

    public Student(String name, String classes, double mark) {
        this.name = name;
        this.classes = classes;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    
    @Override
    public int compareTo(Student otherStudent) {
        return this.getName().compareTo(otherStudent.getName());
    }


    @Override
    public String toString() {
        return "Name: " + name + "\nClasses: " + classes + "\nMark: " + mark;
    }
}
