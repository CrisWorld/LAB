/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import models.FileHandler;
import view.GeneralView;

/**
 *
 * @author quoch
 */
public class FileController {
    public void copyWordOneTimes() throws Exception{
        GeneralView view = new GeneralView();
        String[] data = view.getSource();
        int length = data[0].split("\\\\").length;
        String parentPath = "";
        for(int i = 0; i < length - 1; i++){
            parentPath += data[0].split("\\\\")[i] + "\\";
        }
        
        FileHandler file = new FileHandler(data[0]);
        ArrayList<String> dataFromFile = file.readFile();
        Set<String> result = extractUniqueWords(dataFromFile);
        FileHandler newFile = new FileHandler(parentPath + (String) data[1]);
        newFile.writeFile(parentPath + (String) data[1], result.toArray(new String[0]));
        view.displayMessage("Copy done");
    }
    
    public Set<String> extractUniqueWords(ArrayList<String> lines) {
        Set<String> uniqueWords = new HashSet<>();
        // Tách các từ từ dòng và thêm vào danh sách các từ duy nhất
        for(String line: lines){
            String[] words = line.split("\\s+");
            for (String word : words) {
                uniqueWords.add(word.toLowerCase()); // Chuyển đổi thành chữ thường để tránh sự phân biệt chữ hoa/chữ thường
            }
        }
        return uniqueWords;
    }
}
