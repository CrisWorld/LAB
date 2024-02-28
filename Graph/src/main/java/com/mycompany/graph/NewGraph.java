/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graph;

/**
 *
 * @author quoch
 */
class Address{
    private String name;

    public Address(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}

class MyQueue{
    private int[] queue;
    private int left;
    private int right;
    private int size;
    public MyQueue(int size){
        this.size = size;
        left = right = 0;
        queue = new int[size];
    }
    public void enqueue(int k){
        queue[right%size] = k;
        right++;
    }
    public int dequeue(){
        left++;
        return queue[(left-1)%size];
    }
    public boolean isEmpty(){
        return left >= right;
    }
    
}
public class NewGraph {
    private int[][] map;
    private Address[] addresses;
    boolean[] is;
    public NewGraph(int[][] map, Address[] addresses) {
        this.map = map;
        this.addresses = addresses;
    }
    public void breadthFirst(int k){
        MyQueue q = new MyQueue(map.length);
        int i,h;
        boolean [] enqueued = new boolean[map.length];
        for(i=0;i<map.length;i++) enqueued[i]=false;
        q.enqueue(k);
        enqueued[k]=true;
        while(!q.isEmpty()){
            h = q.dequeue();
            visit(h); 
            for(i=0;i<map.length;i++) if((!enqueued[i]) && map[h][i]>0){
                q.enqueue(i);
                enqueued[i] = true;
            }
        }
   }
    
    public void depthFirst(int k, boolean[] visited){
        if(visited == null){
            visited = new boolean[map.length];
            for(int i=0; i<map.length; i++) visited[i] = false;
        }
        visit(k);
        visited[k] = true; 
        int j;
        for(j=0;j<map[k].length;j++)
            if(map[k][j]>0 && (!visited[j]))
               depthFirst(j,visited);
    }
   public void visit(int value){
       System.out.println(addresses[value].getName());
   }
   
   public int getAddressIndex(String name) throws Exception{
       if(map == null || addresses == null) throw new Exception("Error");
       for(int i=0; i<addresses.length; i++) 
           if(name.compareTo(addresses[i].getName()) == 0) return i;
       return -1;
   }
   
   public int floyd(int origin, int destination){
       int[][] p = new int[map.length][map.length];
       for(int i=0; i<map.length; i++)
           for(int j=0; j<map.length; j++)
              p[i][j] = -1;
       // clone map
       int[][] d = new int[map.length][map.length];
       for(int i=0; i<map.length; i++)
           for(int j=0; j<map.length; j++)
               if(map[i][j] == 0) d[i][j] = 999999; else
               d[i][j] = map[i][j];
       //

       for(int k=0 ; k<map.length; k++)
           for(int i=0 ; i<map.length; i++)
               for(int j=0 ; j<map.length; j++){
                   if(d[i][j] > d[i][k] + d[k][j] && d[k][j] != 0 && d[i][k] !=0){
                        d[i][j] = d[i][k] + d[k][j];
                        p[i][j] = k;
                   }
               }
       int o = origin;
       int des = destination;
       System.out.println(o);
       while(p[o][des] != des && p[o][des] != -1){
           System.out.println(p[o][des]);
           o = p[o][des];
       } 
       System.out.println(des);
       return d[origin][destination];
   }

   public void displayArray(int[][] array){
       for(int i=0; i<array.length; i++){
           for(int j=0; j<array.length; j++){
               System.out.print(array[i][j] + " ");
           }
           System.out.println("");
       }
           
   }
    public static void main(String[] args) throws Exception {
        int[][] map = {
            {-999,-999,-2,-999},
            {4,-999,3,-999},
            {-999,-999,-999,2},
            {-999,-1,-999,-999}
        };
        Address[] addresses = {
            new Address("Ha Noi"), 
            new Address("Da Nang"),
            new Address("Hoi An"),
            new Address("Da Lat"),
        };
        NewGraph graph = new NewGraph(map, addresses);
//        System.out.println("Breadth First Traversel");
//        graph.breadthFirst(graph.getAddressIndex("Da Nang"));
//        System.out.println("Depth First Traversel");
//        graph.depthFirst(1, null);
        System.out.println(graph.floyd(0, 3));
    }
}