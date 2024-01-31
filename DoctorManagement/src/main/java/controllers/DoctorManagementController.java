/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Doctor;
import models.DoctorHash;
import views.DoctorView;

/**
 *
 * @author quoch
 */
public class DoctorManagementController extends Menu {
    private DoctorHash doctorTable;
    private DoctorView view = new DoctorView();
    public DoctorManagementController(String title, String[] options, DoctorHash doctorTable){
        super(title, options);
        this.doctorTable = doctorTable;
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                //add
                try{
                    Doctor doctor = view.getDoctor(1);
                    doctorTable.addDoctor(doctor);
                    view.displayMessage("Status doctor added");
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                // update
                
                try{
                    view.showDoctors(doctorTable.getDoctorArrayList());
                    Doctor doctor = view.getDoctor(0);
                    doctorTable.updateDoctor(doctor);
                    view.displayMessage("Status doctor fixed");
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 3: 
                // delete
                try{
                    view.showDoctors(doctorTable.getDoctorArrayList());
                    String code = view.getDeleteCode();
                    doctorTable.deleteDoctor(doctorTable.getDoctorByCode(code));
                    view.displayMessage("Status doctor fixed");
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                // search
                try{
                    String str = view.getSearchText();
                    view.showDoctors(doctorTable.searchDoctor(str));
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        String title = "======== DOCTOR MANAGEMENT ========";
        String[] options = new String[]{
            "Add Doctor", "Update Doctor", "Delete Doctor", "Search Doctor"
        };
        DoctorManagementController main = new DoctorManagementController(title, options, new DoctorHash());
        main.run();
    }
}
