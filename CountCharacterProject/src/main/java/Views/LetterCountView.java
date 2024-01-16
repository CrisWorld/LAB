/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.util.Hashtable;

/**
 *
 * @author sewrf
 */
public class LetterCountView {
    public LetterCountView() {
    }
    public void display(Hashtable<String, Integer> storage){
        System.out.print("{ ");
        storage.forEach((k,v) -> {
            System.out.print(k+"="+v+" ");
        });
        System.out.print(" }\n");
    }
}
