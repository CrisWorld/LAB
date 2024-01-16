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
public class Fresher extends Candicate {
    private int graduationDate;
    private int graduationRank;
    private String education;
    public Fresher(int id, int candicateType, String firstName, String lastName, String address, String phone, String email, int birthday) {
        super(candicateType, firstName, lastName, address, phone, email, birthday);
    }

    public Fresher(int graduationDate, int graduationRank, String education, int candicateType, String firstName, String lastName, String address, String phone, String email, int birthday) {
        super(candicateType, firstName, lastName, address, phone, email, birthday);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }    
    public Fresher(int graduationDate, int graduationRank, String education, Candicate c){
        super(c);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public int getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(int graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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
