/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.mycompany.number.Menu;
import com.mycompany.number.Validator;
import java.util.ArrayList;
import models.QuadraticEquation;
import models.SimpleEquation;
import view.Information;
import view.ResultView;

/**
 *
 * @author quoch
 */
public class MainController extends Menu{

    public MainController(String title, String[] options) {
        super(title, options);
    }

    @Override
    public void execute(int n) {
        Information info = new Information();
        ResultView resultView = new ResultView();
        Validator validator = new Validator();
        switch(n){
            case 1:
            {
                double[] nums = info.getNumbersOfSimpleEquation();
                SimpleEquation equation = new SimpleEquation(nums[0], nums[1]);
                ArrayList generalNumber = new ArrayList();
                generalNumber.add(nums[0]);
                generalNumber.add(nums[1]);
                Byte flag = equation.checkSolution();
                if(flag == -1){
                    generalNumber.add(equation.getSolution());
                    resultView.displaySolution(equation.getSolution());
                } else if (flag == 0){
                    resultView.displayNoSolution();
                } else resultView.displayInfinitySolution();
                ArrayList odds = new ArrayList();
                ArrayList evens = new ArrayList();
                ArrayList perfectSquares = new ArrayList();
                for(int i = 0; i < generalNumber.size(); i++){
                    if((int)(double) generalNumber.get(i) % 2 == 0) evens.add(generalNumber.get(i));
                    else odds.add(generalNumber.get(i));
                    if(validator.isPerfectSquare((double) generalNumber.get(i))) perfectSquares.add(generalNumber.get(i));
                }
                resultView.displayEvenAndOdd(evens, odds);
                resultView.displayPerfectSquare(perfectSquares);
                break;
            }
            case 2:
            {
                double[] nums = info.getNumbersOfQuadraticEquation();
                QuadraticEquation equation = new QuadraticEquation(nums[0], nums[1], nums[2]);
                ArrayList generalNumber = new ArrayList();
                generalNumber.add(nums[0]); 
                generalNumber.add(nums[1]); 
                generalNumber.add(nums[2]); 
                Byte flag = equation.checkSolution();
                if(flag == 1){
                    double[] solutions = equation.getSolutions();
                    if(solutions[0] == solutions[1]){
                        generalNumber.add(solutions[1]);
                    } else {
                        generalNumber.add(solutions[0]);
                        generalNumber.add(solutions[1]);
                    }
                    resultView.displaySolution(solutions);
                } else if (flag == 0){
                    resultView.displayNoSolution();
                }
                 ArrayList odds = new ArrayList();
                ArrayList evens = new ArrayList();
                ArrayList perfectSquares = new ArrayList();
                for(int i = 0; i < generalNumber.size(); i++){
                    if((int)(double) generalNumber.get(i) % 2 == 0) evens.add(generalNumber.get(i));
                    else odds.add(generalNumber.get(i));
                    if(validator.isPerfectSquare((int)(double) generalNumber.get(i))) perfectSquares.add(generalNumber.get(i));
                }
                resultView.displayEvenAndOdd(evens, odds);
                resultView.displayPerfectSquare(perfectSquares);
                break;
            }
            case 3: 
                System.exit(0);
                break;
        }
    }
    public static void main(String[] args) {
        String title = "Equation Program";
        String[] options = new String[]{
            "Calculate Superlative Equation",
            "Calculate Quadratic Equation",
            "Exit"
        };
        MainController menu = new MainController(title, options);
        menu.run();
    }
    
}
