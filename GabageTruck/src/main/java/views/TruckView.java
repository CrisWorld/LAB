/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import com.mycompany.gabagetruck.Validator;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class TruckView {
    public int[] getGabageCollection(){
        Validator validator = new Validator();
        Scanner sc = new Scanner(System.in);
        String size, gabageStation;
        boolean flag;
        do{
            flag = false;
            System.out.println("Enter the amount of garbage at each station in order by quantity (kg) ");
            gabageStation = sc.nextLine();
            for(String station: gabageStation.split("\\s+")){
                if(!validator.isDigit(station)) flag = true;
            }
            if(!flag) break;
        } while(true);
        String[] gabageStationsString = gabageStation.split("\\s+");
        int[] gabageStations = new int[gabageStationsString.length];
        for(int i = 0; i<gabageStationsString.length; i++){
            gabageStations[i] = Integer.parseInt(gabageStationsString[i]);
        }
        return gabageStations;
    }
    public void showMessage(String msg){
        System.out.println(msg);
    }
    public void displayResult(double result){
        showMessage("The total cost is " + result);
    }
}
