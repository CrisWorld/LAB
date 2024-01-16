/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Candicate;
import Models.Experience;
import Models.Fresher;
import Models.Intern;
import Models.Menu;
import Views.CandicateFormView;
import Views.SearchFormView;
import java.util.ArrayList;

/**
 *
 * @author quoch
 */
public class Main extends Menu{
    private CandicateSystem system;
    public Main(String td, String[] mc, CandicateSystem system) {
        super(td, mc);
        this.system = system;
    }
    @Override
    public void execute(int n) {
        CandicateFormView cfv = new CandicateFormView();
        SearchFormView sfv = new SearchFormView(this.system);
        Candicate newC;
        
        switch(n){
            case 1:
                Experience newC1 = cfv.getExperience();
                system.getExperiences().add(newC1);
                break;
            case 2:
                Fresher newC2 = cfv.getFresher();
                system.getFreshers().add(newC2);
                break;
            case 3:
                Intern newC3 = cfv.getIntern();
                system.getInterns().add(newC3);
                break;
            case 4:
                ArrayList input = sfv.getCadicateTypeAndName();
                ArrayList<Candicate> result = system.search(c -> (boolean)((String) input.get(1)).trim().equals(((String)(c.getFirstName() + " " + c.getLastName())).trim()), (int) input.get(0));
                cfv.showCandicates((int) input.get(0), result);
                break;
        }
    }
    public static void main(String[] args) {
        CandicateSystem system = new CandicateSystem();
        String title = "CANDIDATE MANAGEMENT SYSTEM";
        String []options = {
            "Experience", "Fresher", "Internship", "Searching", "Exit"
        };
        Main menu = new Main(title, options, system);
        menu.run();
    }
    
}
