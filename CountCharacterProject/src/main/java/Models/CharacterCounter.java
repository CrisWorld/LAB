/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Hashtable;
import java.util.StringTokenizer;

/**
 *
 * @author quoch
 */
public class CharacterCounter {
    private String characters;
    private Hashtable<String, Integer> storage;
    public CharacterCounter(String characters){
        this.characters = characters;
        storage = new Hashtable<>();
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public Hashtable<String, Integer> getStorage() {
        return storage;
    }

    public void setStorage(Hashtable<String, Integer> storage) {
        this.storage = storage;
    }
    
    public CharacterCounter countCharacters(){
        for(int i=0; i<characters.length(); i++){
            char character = characters.charAt(i);
            if (Character.isLetter(character)){
                String letter = Character.toString(character).toLowerCase();
                if(storage.get(letter) != null){
                    int count = storage.get(letter);
                    count++;
                    storage.put(letter, count);
                } else  storage.put(letter, 1);
            }
        }
        return this;
    }
}
