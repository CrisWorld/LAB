/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author quoch
 */
interface TruckInterface {
    public void run();
    public void goDump();
    public void goTo(int pos);
    static float loadAverage = 8;
    static float dumpAverage = 30;
    static double laborAndTransCost = 120000;
    static double dumpCost = 57000;
    static double maximunLoad = 10000;
}
