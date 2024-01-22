/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.normalizationtext;

/**
 *
 * @author quoch
 */
public class NormalizationText {
    public String removeDuplicateSpace(String str){
        return str.replaceAll("\\s{2,}", " ");
    }
    public String formatAfterSign(String str, String sign){
        String[] array = str.split("\\" + sign);
        if(array.length > 1){
            array[0] = array[0].trim();
            for(int i=1; i < array.length; i++){
                array[i] = " "+array[i].trim();
            }
        } else return str;
        String result = "";
        if(sign.equals(".")){
            for(int i=0; i < array.length - 1; i++){
                String firstLetter = Character.toString(array[i].toUpperCase().trim().charAt(0));
                String firstLetterOld = firstLetter.toLowerCase();
                result += array[i].replaceFirst(firstLetterOld, firstLetter) + sign;
            }
            String firstLetter = Character.toString(array[array.length-1].toUpperCase().trim().charAt(0));
            String firstLetterOld = firstLetter.toLowerCase();
            result += array[array.length-1].replaceFirst(firstLetterOld, firstLetter);
        } else {
            for(int i=0; i < array.length - 1; i++){
                String firstLetter = Character.toString(array[i].toLowerCase().trim().charAt(0));
                String firstLetterOld = firstLetter.toUpperCase();
                result += array[i].replaceFirst(firstLetterOld, firstLetter) + sign;
            }
            String firstLetter = Character.toString(array[array.length - 1].toLowerCase().trim().charAt(0));
            String firstLetterOld = firstLetter.toUpperCase();
            result += array[array.length-1].replaceFirst(firstLetterOld, firstLetter);
        }
        return result;
    }
    public String formatStartAndEndOfParagraph(String str){
        str += " ";
        String replace = Character.toString(str.trim().charAt(0)).toUpperCase();
        str = str.trim();
        if(str.charAt(str.length()-1) != '.') str+=".";
        return str.replaceFirst(Character.toString(str.trim().charAt(0)), replace);
    }
    public String formatQuote(String str){
        String[] array = str.split("\"");
        String result = "";
        if(array.length > 2){
            for(int i=1; i < array.length; i += 2){
                array[i] = "\"" + array[i].trim() + "\"";
            }
        } else return result;
        for(String s: array){
            result += s;
        }
        return result;
    }
    public String normalize(String str){
        str = str.toLowerCase();
        str = this.formatQuote(str);
        str = this.removeDuplicateSpace(str);
        str = this.formatAfterSign(formatAfterSign(formatAfterSign(str,","),":"), ".");
        str = this.formatStartAndEndOfParagraph(str);
        return str;
    }
    public static void main(String[] args) {
        String input = "toi la ,Dat.toi 27,o \" da  nang \" ";
        NormalizationText normalization = new NormalizationText();
//        System.out.println(normalization.formatAfterSign(input, ","));
        System.out.println(normalization.normalize(input));
    }
}
