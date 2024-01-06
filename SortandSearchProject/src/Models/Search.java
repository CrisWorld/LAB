/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author quoch
 */
public class Search {
    // inject 1 doi tuong Sort de su dung lai sort
    private float value;
    private float[] array;
    
    public Search(float value, float arr[]){
        this.value = value;
        array = arr;
    }
    public void setArray(float[] arr){
        array = arr;
    }
    public float[] getArray(){
        return array;
    }
    public void setValue(float value){
        this.value = value;
    }
    public float getValue(){
        return this.value;
    }
    public int binarySearch(float value, int head, int tail){
        int middle = (head+tail)/2;
        if(array[middle] == value) return middle;
        if(head < tail){
            if(array[middle] > value){
                return binarySearch(value, head, middle-1);
            } else return binarySearch(value, middle+1, tail);
        } else return -1;
    }
    public int linearSearch(float value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
    public int getResultByBinarySearch(){
        return binarySearch(this.value, 0, this.array.length-1);
    }
    public int getResultByLinearSearch(){
        return linearSearch(this.value);
    }
}
