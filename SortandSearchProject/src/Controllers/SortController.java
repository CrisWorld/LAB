/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Sort;

/**
 *
 * @author quoch
 */
public class SortController {
    public void displayArray(float arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void runBubbleSort(float array[]){
        System.out.println("Array before sort");
        displayArray(array);
        Sort sort = new Sort(array);
        sort.bubbleSort();
        System.out.println("Array After sort");
        displayArray(sort.getArray());
    }
    public void runQuickSort(float array[]){
        Sort sort = new Sort(array);
        System.out.println("Array before sort");
        displayArray(array);
        sort.quickSort(0, array.length-1);
        System.out.println("Array After sort");
        displayArray(sort.getArray());
    }
}
