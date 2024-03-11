/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spanningtree;

/**
 *
 * @author quoch
 */
import java.util.*;

class Edge {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class Graph {
    private List<List<Edge>> adjacencyList;

    public Graph(int vertices) {
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencyList.get(source).add(edge);

//      đồ thị vô hướng
        edge = new Edge(destination, source, weight);
        adjacencyList.get(destination).add(edge);
    }

    public List<Edge> findMinimumSpanningTree() {
        List<Edge> result = new ArrayList<>();
        boolean[] visited = new boolean[adjacencyList.size()];
        MinHeap minHeap = new MinHeap();

        // Start from vertex 0
        
        for(Edge e: adjacencyList.get(0)){
            minHeap.push(e);
        }
        visited[0] = true;

        while (!minHeap.isEmpty()) {
            Edge currentEdge = minHeap.pop();
            int destination = currentEdge.destination;

            if (!visited[destination]) {
                visited[destination] = true;
                result.add(currentEdge);

                // Add all non-visited edges from the destination to the minHeap
                for(Edge e: adjacencyList.get(destination)){
                    if(!visited[e.destination]) minHeap.push(e);
                }
            }
        }

        return result;
    }
}

public class SpanningTree {

    public static void main(String[] args) {
        int vertices = 9;
        Graph graph = new Graph(vertices);

        // Adding edges with weights
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 4);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 5, 4);
        graph.addEdge(2, 8, 2);
        graph.addEdge(3, 5, 14);
        graph.addEdge(3, 4, 9);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);
        List<Edge> minimumSpanningTree = graph.findMinimumSpanningTree();

        // Print the edges in the minimum spanning tree
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (Edge edge : minimumSpanningTree) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);
        }
    }
}
