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
public class Experience extends Candicate {
    private int expInYear;
    private String proSkills;

    public Experience(int candicateType, String firstName, String lastName, String address, String phone, String email, int birthday) {
        super(candicateType, firstName, lastName, address, phone, email, birthday);
    }

    public Experience(int expInYear, String proSkills, int candicateType, String firstName, String lastName, String address, String phone, String email, int birthday) {
        super(candicateType, firstName, lastName, address, phone, email, birthday);
        this.expInYear = expInYear;
        this.proSkills = proSkills;
    }
    public Experience(int expInYear, String proSkills, Candicate c){
        super(c);
        this.expInYear = expInYear;
        this.proSkills = proSkills;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkills() {
        return proSkills;
    }

    public void setProSkills(String proSkills) {
        this.proSkills = proSkills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandicateType() {
        return candicateType;
    }

    public void setCandicateType(int candicateType) {
        this.candicateType = candicateType;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
