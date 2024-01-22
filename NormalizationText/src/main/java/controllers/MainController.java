/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.mycompany.normalizationtext.NormalizationText;
import models.FileInteraction;
import views.ShowingView;

/**
 *
 * @author quoch
 */
public class MainController {
    public static void main(String[] args) {
        FileInteraction file = new FileInteraction("input.txt", "output.txt");
        NormalizationText handling = new NormalizationText();
        ShowingView showing = new ShowingView();
        String str = file.readFile();
        showing.showStringBeforeProcessing(str);
        String result = handling.normalize(str);
        showing.showResult(result);
        file.writeFile(result);
    }
}
