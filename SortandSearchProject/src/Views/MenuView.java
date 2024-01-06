/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Controllers.SearchController;
import Controllers.SortController;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class MenuView extends Menu<String> {
    private float[] arr;
    private SearchController searchController = new SearchController();
    private SortController sortController = new SortController();
    public MenuView(String title, String[] options){
        super(title, options);
    }
    public float[] generateArray(int size){
        Random random = new Random();
        float arr1[] = new float[size];
        for(int i = 0; i<size; i++){
            arr1[i] = random.nextFloat();
        }
        return arr1;
    }
    public void displayArray(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void execute(int n) {
        Scanner scan = new Scanner(System.in);
        int size;
        switch(n){
            case 1:
                System.out.println("Enter size of array: ");
                size = scan.nextInt();
                if(size > 0) {
                    arr = new float[size];
                    System.out.println("Enter your value");
                    for(int i=0; i<size; i++){
                        arr[i] = scan.nextFloat();
                    }
                }
                displayArray();
                break;
            case 2:
                System.out.println("Enter size of array: ");
                size = scan.nextInt();
                if(size > 0) {
                    arr =generateArray(size);
                    displayArray();
                }
                break;
            case 3:
                sortController.runBubbleSort(arr);
                break;
            case 4:
                sortController.runQuickSort(arr);
                break;
            case 5:
                System.out.println("Enter your value");
                searchController.runLinearSearch(scan.nextFloat(), arr);
                break;
            case 6:
                System.out.println("Enter your value");
                searchController.runBinarySearch(scan.nextFloat(), arr);
                break;
        }
    }
    
}
