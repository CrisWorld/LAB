/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Models.Candicate;
import Models.Experience;
import Models.Fresher;
import Models.Intern;
import Models.Validator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class CandicateFormView {
    public Candicate getCadicate(){
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        System.out.println("======Candicate Form======");
        String firstName, lastName, address, phone, email;
        int birthDate;
        while(true){
            System.out.println("Fisrt Name: ");
            firstName = sc.nextLine();
            if (validator.isAlphabic(firstName)) break;
            else System.out.println("Invalid input");
        }
        sc.nextLine();
        while(true){
            System.out.println("Last Name: ");
            lastName = sc.nextLine();
            if (validator.isAlphabic(lastName)) break;
            else System.out.println("Invalid input");
        }
        sc.nextLine();
        while(true){
            System.out.println("Birth Date(1990-current): ");
            birthDate = sc.nextInt();
            if (validator.isEnough(birthDate, 1990, LocalDate.now().getYear())) break;
            else System.out.println("Invalid input");
        }
        sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
        sc.nextLine();
        while(true){
            System.out.println("Phone: ");
            phone = sc.nextLine();
            if (validator.isPhone(phone)) break;
            else System.out.println("Invalid input");
        }
        sc.nextLine();
        while(true){
            System.out.println("Email: ");
            email = sc.nextLine();
            if (validator.isEmail(email)) break;
            else System.out.println("Invalid input");
        }
        return new Candicate(firstName, lastName, address, phone, email, birthDate);
    }
    public Experience getExperience(){
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        Candicate c = this.getCadicate();
        int expInYear;
        String skills;
        while(true){
            System.out.println("Year of experience: ");
            expInYear = sc.nextInt();
            if(validator.isEnough(expInYear, 0, 100)) break;
            else System.out.println("Invalid input");
        }
        sc.nextLine();
        System.out.println("Professional Skill: ");
        skills = sc.nextLine();
        Experience newC = new Experience(expInYear, skills, c);
        newC.setCandicateType(0);
        return newC;
    }
    public Fresher getFresher(){
        Scanner sc = new Scanner(System.in);
        Candicate c = this.getCadicate();
        Validator validator = new Validator();
        int graduatedYear, rank;
        String nameEducation;
        while(true){
            System.out.println("Graduated time (yyyy): ");
            graduatedYear = sc.nextInt();
            if(validator.isEnough(graduatedYear, 1900, LocalDate.now().getYear())) break;
            else System.out.println("Invalid input");
        }
        sc.nextLine();
        System.out.println("Education: ");
        nameEducation = sc.nextLine();
        sc.nextLine();
        while(true){
            System.out.println("Graduated rank (1.Excellence, 2.Good, 3.Fair, 4.Poor): ");
            rank = sc.nextInt();
            if(validator.isEnough(rank, 1, 4)) break;
            else System.out.println("Invalid input");
        }
        Fresher fresher = new Fresher(graduatedYear, rank, nameEducation, c);
        fresher.setCandicateType(1);
        return fresher;
    }
    public Intern getIntern(){
        Candicate c = this.getCadicate();
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        String majors, universityName;
        int semester;
        System.out.println("Majors: ");
        majors = sc.nextLine();
        sc.nextLine();
        while(true){
            System.out.println("Semester(0->30): ");
            semester = sc.nextInt();
            if(validator.isEnough(semester, 0, 30)) break; 
            else System.out.println("Invalid input");
        }
        sc.nextLine();
        System.out.println("University name: ");
        universityName = sc.nextLine();
        Intern intern = new Intern(majors, universityName, semester, c);
        intern.setCandicateType(2);
        return intern;
    }
    public void showCandicates(int type, ArrayList<Candicate> result){
        switch(type){
            case 0:
                System.out.println("===========EXPERIENCE CANDIDATE============");
                break;
            case 1:
                System.out.println("===========FRESHER CANDIDATE============");
                break;
            case 2:
                System.out.println("===========INTERN CANDIDATE============");
                break;
        }
        for(Candicate c: result){
            System.out.println(c);
        }
    }
}
