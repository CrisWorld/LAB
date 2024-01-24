/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.util.ArrayList;

/**
 *
 * @author sewrf
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        while (true) {
            int choice = GeoManage.menu();
            switch (choice) {
                case 1:
                    GeoManage.inputCountry(lc);
                    break;
                case 2:
                    GeoManage.printCountry(lc);
                    break;
                case 3:
                    GeoManage.searchByName(lc);
                    break;
                case 4:
                    GeoManage.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
