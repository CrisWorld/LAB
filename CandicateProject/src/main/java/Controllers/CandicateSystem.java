/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Candicate;
import Models.Experience;
import Models.Fresher;
import Models.Intern;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author quoch
 */
public class CandicateSystem {
    private ArrayList<Experience> experiences;
    private ArrayList<Fresher> freshers;
    private ArrayList<Intern> interns;
    
    public CandicateSystem(){
        this.experiences = new ArrayList<Experience>();
        this.freshers = new ArrayList<Fresher>();
        this.interns = new ArrayList<Intern>();
        experiences.add(new Experience(0, "Hoang", "Quoc", "asdasd", "12321312", "quoch134@gmail.com", 2004));
    }
    public ArrayList<Candicate> search(Predicate<Candicate> p, int type){
        ArrayList<Candicate> result = new ArrayList<Candicate>();
        switch(type){
            case 0: 
                for(Experience c: experiences){
                    // test
                    System.out.println(c.getFirstName() + " " + c.getLastName());
                    if(p.test(c)) result.add(c);
                }
                break;
            case 1:
                for(Fresher c: freshers){
                    if(p.test(c)) result.add(c);
                }
                break;
            case 2:
                for(Intern c: interns){
                    if(p.test(c)) result.add(c);
                }
                break;
            case 4:
                break;
        }
        
        return result;
    }
    public ArrayList<Experience> getExperiences(){
        return experiences;
    }
    public ArrayList<Fresher> getFreshers(){
        return freshers;
    }
    public ArrayList<Intern> getInterns(){
        return interns;
    }
}
