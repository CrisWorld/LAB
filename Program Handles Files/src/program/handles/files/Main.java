/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.handles.files;

/**
 *
 * @author sewrf
 */
public class Main {

    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.findPersonInfo();
                    break;
                case 2:
                    Manager.coppyNewFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}