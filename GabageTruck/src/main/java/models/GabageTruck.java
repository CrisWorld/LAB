/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
public class GabageTruck implements TruckInterface{
    private int[] gabageStations;
    private int tolalDumps;
    private double dumpLoad;
    
    public GabageTruck(int[] gabageStations){
        this.gabageStations = gabageStations;
    }
    
    public double getTotalMinutes(){
        return ((this.tolalDumps * dumpAverage) + (gabageStations.length * loadAverage));
    }
    
    public double getTotalCost(){
        double totalMinutes = getTotalMinutes();
        double cost;
        cost = totalMinutes/60*laborAndTransCost + tolalDumps*dumpCost;
        return cost;
    }
    
    public void goTo(int position){
        if(dumpLoad + gabageStations[position] <= maximunLoad){
            dumpLoad += gabageStations[position];
        } else {
            goDump();
            dumpLoad += gabageStations[position];
        }
    }
    
    public void goDump(){
        dumpLoad = 0;
        tolalDumps++;
    }
    
    public void run(){
        tolalDumps = 0;
        dumpLoad = 0;
        for(int i = 0; i<gabageStations.length; i++){
            goTo(i);
        }
        if(dumpLoad != 0) goDump();
    }
    
    public static void main(String[] args) {
        int[] gabageStations = {
            1765,2808,952,4206,3102,3902,1292,3985,8324,1928,4426,397,3277
        };
        GabageTruck truck = new GabageTruck(gabageStations);
        truck.run();
        System.out.println(truck.getTotalCost());
    }
}
