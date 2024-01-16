/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;


/**
 *
 * @author quoch
 */
public class Intern extends Candicate{
    private String major, universityName;
    private int semester;
    public Intern(int candicateType, String firstName, String lastName, String address, String phone, String email, int birthday) {
        super(candicateType, firstName, lastName, address, phone, email, birthday);
    }

    public Intern(String major, String universityName, int semester, int candicateType, String firstName, String lastName, String address, String phone, String email, int birthday) {
        super(candicateType, firstName, lastName, address, phone, email, birthday);
        this.major = major;
        this.universityName = universityName;
        this.semester = semester;
    }
    public Intern(String major, String universityName, int semester, Candicate c){
        super(c);
        this.major = major;
        this.universityName = universityName;
        this.semester = semester;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
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
