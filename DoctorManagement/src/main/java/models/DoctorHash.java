/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DoctorHash {
    private HashMap<String, Doctor> doctorMap;

    public DoctorHash() {
        this.doctorMap = new HashMap<>();
        initData();
    }
    
    public void initData(){
        doctorMap.put("001", new Doctor("001", "John Doe", "Cardiologist", 5));
        doctorMap.put("002", new Doctor("002", "Jane Smith", "Pediatrician", 8));
        doctorMap.put("003", new Doctor("003", "Michael Johnson", "Orthopedic Surgeon", 7));
        doctorMap.put("004", new Doctor("004", "Emily Davis", "Dermatologist", 10));
        doctorMap.put("005", new Doctor("005", "Robert Brown", "Ophthalmologist", 6));
        doctorMap.put("006", new Doctor("006", "Emma White", "Gynecologist", 9));
        doctorMap.put("007", new Doctor("007", "Daniel Lee", "Neurologist", 8));
        doctorMap.put("008", new Doctor("008", "Olivia Miller", "Psychiatrist", 7));
        doctorMap.put("009", new Doctor("009", "William Wilson", "General Practitioner", 12));
        doctorMap.put("010", new Doctor("010", "Sophia Moore", "Urologist", 11));
    }

    public boolean addDoctor(Doctor doctor) throws Exception {
        checkDatabaseExistence();

        if (doctor == null) {
            throw new Exception("Data does not exist");
        }

        if (doctorMap.containsKey(doctor.getCode())) {
            throw new Exception("Doctor code [" + doctor.getCode() + "] is duplicate");
        }

        doctorMap.put(doctor.getCode(), doctor);
        return true;
    }

    public boolean updateDoctor(Doctor doctor) throws Exception {
        checkDatabaseExistence();

        if (doctor == null) {
            throw new Exception("Data does not exist");
        }

        checkDoctorExistence(doctor.getCode());

        doctorMap.put(doctor.getCode(), doctor);
        return true;
    }

    public boolean deleteDoctor(Doctor doctor) throws Exception {
        checkDatabaseExistence();
        
        if (doctor == null) {
            throw new Exception("Data does not exist");
        }
        
        checkDoctorExistence(doctor.getCode());
        
        doctorMap.remove(doctor.getCode());
        return true;
    }

    public ArrayList<Doctor> searchDoctor(String input) throws Exception {
        checkDatabaseExistence();
        
        ArrayList<Doctor> result = new ArrayList<Doctor>();

        for (Map.Entry<String, Doctor> entry : doctorMap.entrySet()) {
            Doctor doctor = entry.getValue();
            if (doctor.getName().contains(input) ||
                doctor.getSpecialization().contains(input) ||
                doctor.getCode().contains(input) ||
                String.valueOf(doctor.getAvailability()).contains(input)) {
                result.add(doctor);
            }
        }

        return result;
    }
    
    public ArrayList<Doctor> getDoctorArrayList() throws Exception{
        checkDatabaseExistence();
        Collection<Doctor> values = doctorMap.values();
        ArrayList<Doctor> result = new ArrayList<>(values); 
        return result;
    }
    
    public Doctor getDoctorByCode(String code) throws Exception{
        checkDatabaseExistence();
        checkDoctorExistence(code);
        Doctor doctor = doctorMap.get(code);
        if(doctor == null) throw new Exception("Data doesn't exist");
        return doctor;
    }
    
    private void checkDoctorExistence(String code) throws Exception{
        if (!doctorMap.containsKey(code)) {
            throw new Exception("Doctor code doesn't exist");
        }
    }
    private void checkDatabaseExistence() throws Exception {
        if (doctorMap == null) {
            throw new Exception("Database does not exist");
        }
    }
}
