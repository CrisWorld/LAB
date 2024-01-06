/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class Sort {
    private float[] arr;
    public Sort(float[] arr){
        this.arr = arr;
    }
    public void setArray(float[] arr){
        this.arr = arr;
    }
    public float[] getArray(){
        return arr;
    }
    public void swap(int i, int j){
        float temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int partition(int tail, int head){
        float pivot = arr[head];
        int i = tail-1;
        for(int j=tail;j<=head;j++){
          //If current element is smaller than the pivot
          if(arr[j]<pivot)
          {
            //Increment index of smaller element
            i++;
            swap(i,j);
          }
        }
        swap(i+1,head);
        return i+1;
    }
    public void quickSort(int tail, int head){
        if(head>tail){
            int pi = partition(tail, head);
            quickSort(tail, pi-1);
            quickSort(pi+1, head);
        }
    }
    public void bubbleSort(){
        int i, j;
        Boolean swapped;
        for (i = 0; i<arr.length-1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]){
                    swap(j, j+1);
                    swapped = true;
                }
            }    
            if (swapped == false)
                break; 
        }
    }
    public static void main(String[] args) {
    }
}
