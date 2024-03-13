/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.GabageTruck;
import views.TruckView;

/**
 *
 * @author quoch
 */
public class GabageTruckController {
    TruckView view;
    public GabageTruckController(TruckView view){
        this.view = view;
    }
    public void run(){
        int[] stations = view.getGabageCollection();
        GabageTruck model = new GabageTruck(stations);
        model.run();
        view.displayResult(model.getTotalCost());
    }
    public static void main(String[] args) {
        GabageTruckController controller = new GabageTruckController(new TruckView());
        controller.run();
    }
}
