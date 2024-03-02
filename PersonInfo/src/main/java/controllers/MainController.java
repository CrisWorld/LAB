/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.util.Scanner;
import views.PersonView;
/**
 *
 * @author quoch
 */
public class MainController extends Menu {
    private PersonController pc;
    public MainController(String title, String[] options, PersonController pc){
        super(title, options);
        this.pc = pc;
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                pc.getPersons();
                break;
            case 2:
                pc.displayAllPerson();
                break;
            default:
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        Double[] test = new Double[19];
        System.out.println(test.length);
        String title = "=====Management Person programer=====";
        String[] options = {"Input 3 people", "display sorted person list", "exit"};
        new MainController(title, options, new PersonController(new PersonView())).run();
    }
}

