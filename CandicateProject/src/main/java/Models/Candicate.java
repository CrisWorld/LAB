/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author quoch
 */
public class Candicate {
    protected int id ,candicateType, birthDate;
    protected String firstName, lastName, address, phone, email;
    private static int base = 1000;
    public Candicate(int candicateType, String firstName, String lastName, String address, String phone, String email, int birthday) {
        this.id = base++;
        this.candicateType = candicateType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthday;
    }
    public Candicate(String firstName, String lastName, String address, String phone, String email, int birthday) {
        this.id = base++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthday;
    }
    public Candicate(String name){
        this.firstName = name;
    }
    public Candicate(Candicate c){
        this.id = c.getId();
        this.candicateType = c.getCandicateType();
        this.firstName = c.getFirstName();
        this.lastName = c.getLastName();
        this.address = c.getAddress();
        this.phone = c.getPhone();
        this.email = c.getEmail();
        this.birthDate = c.getBirthdayDate();
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected int getCandicateType() {
        return candicateType;
    }

    protected void setCandicateType(int candicateType) {
        this.candicateType = candicateType;
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected int getBirthdayDate() {
        return birthDate;
    }

    protected void setBirthdayDate(int birthday) {
        this.birthDate = birthday;
    }
    @Override
    public String toString() {
        return "["+ firstName + " "  + lastName + ", candicateType=" + candicateType + ", birthdayDate=" + birthDate + ", address=" + address + ", phone=" + phone + ", email=" + email + ']';
    }
}
