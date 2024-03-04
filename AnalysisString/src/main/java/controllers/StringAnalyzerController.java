/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Scanner;
import models.StringAnalyzer;
import views.StringAnalyzerView;

/**
 *
 * @author quoch
 */
public class StringAnalyzerController {
    private StringAnalyzerView view;
    private StringAnalyzer model;

    public StringAnalyzerController(StringAnalyzerView view, StringAnalyzer model) {
        this.view = view;
        this.model = model;
    }

    public void analyzeString(String inputString) {
        model.setInputString(inputString);
        view.displayResults(model);
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        String inputString = view.getData();
        analyzeString(inputString);
    }
    public static void main(String[] args) {
        StringAnalyzerView view = new StringAnalyzerView();
        StringAnalyzer model = new StringAnalyzer();
        StringAnalyzerController controller = new StringAnalyzerController(view, model);
        controller.run();
    }
}
