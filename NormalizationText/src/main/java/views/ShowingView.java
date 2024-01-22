/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author quoch
 */
public class ShowingView {
    public void showResult(String str){
        if(str.equals("")) {
            System.out.println(" No thing to show");
            return;
        }
        System.out.println("Content after processing");
        System.out.println(str);
   }
    public void showStringBeforeProcessing(String str){
        if(str.equals("")) {
            System.out.println(" No thing to show");
            return;
        }
        System.out.println("Content before processing");
        System.out.println(str);
    }
}
