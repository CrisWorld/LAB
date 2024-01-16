/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Models.Candicate;
import Controllers.CandicateSystem;
import Models.Validator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class SearchFormView {
    private CandicateSystem system;
    public SearchFormView(CandicateSystem system){
        this.system = system;
    }
    public void showAllCandicates(){
        System.out.println("=========EXPERIENCE CANDICATE=========");
        for(Candicate c: system.getExperiences()){
            System.out.println(c);
        }
        System.out.println("=========FRESHER CANDICATE=========");
        for(Candicate c: system.getFreshers()){
            System.out.println(c);
        }
        System.out.println("=========INTERN CANDICATE=========");
        for(Candicate c: system.getInterns()){
            System.out.println(c);
        }
    }
    public ArrayList getCadicateTypeAndName(){
        showAllCandicates();
        Scanner sc = new Scanner(System.in);
        ArrayList result = new ArrayList();
        Validator validator = new Validator();
        int typeCandicate;
        String candicateName;
        while(true){
            System.out.println("Type of candicate: ");
            typeCandicate = sc.nextInt();
            if(validator.isEnough(typeCandicate, 0, 2)) break;
            else System.out.println("Invalid Input");
        }
        result.add(typeCandicate);
        sc.nextLine();
        System.out.println("Candicate name: ");
        candicateName = sc.nextLine();
        result.add(candicateName);
        return result;
    }
}
