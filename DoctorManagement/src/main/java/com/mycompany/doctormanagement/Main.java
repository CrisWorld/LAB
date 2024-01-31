/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doctormanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import models.Doctor;
import models.DoctorHash;


public class Main {
    public static void main(String[] args) {
        DoctorHash doctorHash = new DoctorHash();

        try {
            // Example usage
            doctorHash.addDoctor(new Doctor("001", "John Doe", "Cardiologist", 5));
            doctorHash.addDoctor(new Doctor("002", "Jane Smith", "Pediatrician", 8));

            ArrayList<Doctor> searchResult = doctorHash.searchDoctor("Cardiologist");
            // view show doctor
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}