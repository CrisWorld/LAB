/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ContactController;
import model.Contact;
import model.Menu;
import util.ValidationUtil;

/**
 *
 * @author PC
 */
public class HomeView {
    private ContactController contactController = new ContactController();
    private ValidationUtil validationUtil = new ValidationUtil();
    
    public void show(){
        String options[] = {"Add a contact", 
                            "Display all contact",
                            "Delete a contact", 
                            "Exit"};
        Menu<String> homeMenu = new Menu<String>("Contact Program", options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        addContact();
                        System.out.println("Add successfull !!!");
                        break;
                    case 2:
                        System.out.println(String.format("|%-3s|%-20s|%-10s|%-10s|%-10s|%-15s|%-11s|", "ID",  "Full Name", "First name", "Last Name", "Group", "Address", "Phone"));
                        contactController.getAll().forEach(System.out::println);
                        break;
                    case 3:
                        removeContactById();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        throw new AssertionError();
                }
                
            }
        };
        homeMenu.run();
    }
    
    private void addContact(){
       String name = validationUtil.inputWithOutEmpty("Enter Name");
       String group = validationUtil.inputWithOutEmpty("Enter Group");
       String address = validationUtil.inputWithOutEmpty("Enter Address");
       String phone = validationUtil.inputPhone("Enter Phone");
       contactController.addContact(new Contact(name,group,address,phone));
    }
    
    private void removeContactById(){
        int id = validationUtil.inputForParseInteger("Enter ID");
        if(contactController.removeContactById(id)){
            System.out.println("Delete " + id + "successfully !!!");
        } else
            System.out.println("No found contact !!!");
    }
}
