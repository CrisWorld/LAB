/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graph;

/**
 *
 * @author quoch
 */
//class Address{
//    private String name;
//}
//
//class MyQueue{
//    private int[] queue;
//    private int left;
//    private int right;
//    private int size;
//    public MyQueue(int size){
//        this.size = size;
//        left = right = 0;
//        queue = new int[size];
//    }
//    public void enqueue(int k){
//        queue[right%size] = k;
//        right++;
//    }
//    public int dequeue(){
//        left++;
//        return queue[(left-1)%size];
//    }
//    public boolean isEmpty(){
//        return left >= right;
//    }
//    
//}
//public class Graph {
//    private int[][] map;
//    boolean[] is;
//    public Graph(int[][] map) {
//        this.map = map;
//    }
//    public void breadthFirst(int k){
//        MyQueue q = new MyQueue(map.length);
//        int i,h;
//        boolean [] enqueued = new boolean[map.length];
//        for(i=0;i<map.length;i++) enqueued[i]=false;
//        q.enqueue(k);
//        enqueued[k]=true;
//        while(!q.isEmpty()){
//            h = q.dequeue();
//            visit(h); 
//            for(i=0;i<map.length;i++) if((!enqueued[i]) && map[h][i]>0){
//                q.enqueue(i);
//                enqueued[i] = true;
//            }
//        }
//   }
//    
//    public void depthFirst(int k, boolean[] visited){
//        if(visited == null){
//            visited = new boolean[map.length];
//            for(int i=0; i<map.length; i++) visited[i] = false;
//        }
//        visit(k);
//        visited[k] = true; 
//        int j;
//        for(j=0;j<map[k].length;j++)
//            if(map[k][j]>0 && (!visited[j]))
//               depthFirst(j,visited);
//    }
//   public void visit(int value){
//       System.out.println(value);
//   }
//
//
//    public static void main(String[] args) {
//        int[][] map = {{0,1,1,0}, {0,0,1,1}, {1,1,0,0}, {0,0,0,0}};
//        Graph graph = new Graph(map);
//        System.out.println("Breadth First Traversel");
//        graph.breadthFirst(1);
//        System.out.println("Depth First Traversel");
//        graph.depthFirst(1, null);
//    }
//}
