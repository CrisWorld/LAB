/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author quoch
 */
public class Student implements Comparable<Student>{
    private int id, semester;
    private String name;
    private ArrayList<Course> courses;
    public static int base = 1000;
    public Student(String name, int semester, int courseSelected) {
        base++;
        this.id = base;
        this.semester = semester;
        this.name = name;
        this.courses = new ArrayList<Course>();
        courses.add(new Course(courseSelected));
    }
    public ArrayList<Course> getCourses(){
        return this.courses;
    }
    public Course getCourseIfExist(String courseName){
        for(Course course: courses){
            if(course.getName().equals(courseName)) return course;
        }
        return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.getName());
    }
    @Override
    public String toString(){
        String str = id + "|" + name + "|" + semester;
        for(Course course: courses){
            str += "|" + course;
        }
        return  str;
    }
}
