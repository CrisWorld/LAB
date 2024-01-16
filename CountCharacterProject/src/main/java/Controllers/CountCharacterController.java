/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.CharacterCounter;
import Views.CountCharacterView;

/**
 *
 * @author quoch
 */
public class CountCharacterController {
    public void run(String input) {
        CharacterCounter cc = new CharacterCounter(input);
        CountCharacterView view = new CountCharacterView();
        view.display(cc.countCharacters().getStorage());
    }
}
