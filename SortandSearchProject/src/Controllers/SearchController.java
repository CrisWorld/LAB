/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Search;
import Models.Sort;

/**
 *
 * @author quoch
 */
public class SearchController {
    public SearchController(){
    
    }
    public void displayArray(float arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void runLinearSearch(float value, float arr[]){
        Search search = new Search(value, arr);
        int result = search.getResultByLinearSearch();
        if(result == -1){
            System.out.println("Didn't found "+value+" in array");
        } else {
            System.out.println("Founded "+value+" at "+result+" in array");
        }
    }
    public void runBinarySearch(float value, float arr[]){
        System.out.println("Array before sort");
        displayArray(arr);
        Sort sort = new Sort(arr);
        System.out.println("\nArray after sort");
        sort.quickSort(0, arr.length-1);
        displayArray(sort.getArray());
        Search search = new Search(value, sort.getArray());
        int result = search.getResultByBinarySearch();
        if(result == -1){
            System.out.println("\nDidn't found "+value+" in array");
        } else System.out.println("\nFounded "+value+" at "+result+" in array");
    }
}
