/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class FileInteraction {
    private String fileForReading, fileForWriting;
    public FileInteraction(String fileForReading, String fileForWriting){
        this.fileForReading = fileForReading;
        this.fileForWriting = fileForWriting;
    }
    public String readFile() {
        String result = "";
        try {
            Scanner sc = new Scanner(new FileReader(fileForReading));
            while(sc.hasNextLine()) {
                    result += sc.nextLine();
            }
            return result;
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
        }
    }
    public boolean writeFile(String content){
        try {
            FileWriter myWriter = new FileWriter(fileForWriting);
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
