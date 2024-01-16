/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Objects;

/**
 *
 * @author quoch
 */
public class Course {
    private String courseName;
    private int count;

    public Course(int courseSelected) {
        if(courseSelected == 1) this.courseName = "Java";
        else if(courseSelected == 2) this.courseName = ".Net";
        else if(courseSelected == 3) this.courseName = "C/C++";
        this.count = 1;
    }
    public int getCount(){
        return count;
    }
    public String getName(){
        return this.courseName;
    }
    public void setCount(int count){
        if(count > 0) this.count = count;
    }
    public boolean isEqual(String name){
        return this.courseName.toUpperCase().equals(name.toUpperCase());
    }
    @Override
    public String toString(){
        return courseName;
    }
    
}
