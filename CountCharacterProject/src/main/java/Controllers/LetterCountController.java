/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.LetterCount;
import Views.LetterCountView;

/**
 *
 * @author sewrf
 */
public class LetterCountController {
    public void run(String input) {
    LetterCount cc = new LetterCount(input);
    LetterCountView view = new LetterCountView();
    cc.countWord();
    view.display(cc.getStorage());
    }
}

