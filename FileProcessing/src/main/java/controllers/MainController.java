/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.mycompany.fileprocessing.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quoch
 */
public class MainController extends Menu{
    
    public MainController(String title, String[] options){
        super(title, options);
    }
    
    public static void main(String[] args) {
        String title = "========== File Processing =========";
        String[] options = {"Find person info", "Copy Text to new file", "Exit"};
        MainController main = new MainController(title, options);
        main.run();
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                PersonInfoController personInfo = new PersonInfoController();
            {
                try {
                    personInfo.getPerson();
                } catch (Exception ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 2:
                FileController fileCopy = new FileController();
            {
                try {
                    fileCopy.copyWordOneTimes();
                } catch (Exception ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            default:
                System.exit(0);
        }
    }
}
