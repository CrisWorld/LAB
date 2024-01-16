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
public class LetterCount {
    private String Letters;
    private Hashtable<String, Integer> storage;
    public LetterCount(String characters){
        this.Letters = characters;
        storage = new Hashtable<>();
    }

    public String getLetters() {
        return Letters;
    }

    public void setLetters(String characters) {
        this.Letters = characters;
    }

    public Hashtable<String, Integer> getStorage() {
        return storage;
    }

    public void setStorage(Hashtable<String, Integer> storage) {
        this.storage = storage;
    }
    
    public void countWord(){
        StringTokenizer st = new StringTokenizer(Letters);
        while (st.hasMoreTokens()) {
            String nextToken = st.nextToken();
            if (storage.containsKey(nextToken)) {
               storage.put(nextToken, storage.get(nextToken) + 1);
            } else
                storage.put(nextToken, 1);
        }
    }  

  
}
       

