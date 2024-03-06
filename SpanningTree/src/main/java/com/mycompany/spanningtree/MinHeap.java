/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spanningtree;

/**
 *
 * @author quoch
 */
import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Edge> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void push(Edge edge) {
        heap.add(edge);
        heapifyUp();
    }

    public Edge pop() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        Edge root = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        heapifyDown();
        return root;
    }
    
    public boolean isEmpty(){
        return heap.size() == 0;
    }
    
    private void heapifyUp() {
        int index = heap.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).weight < heap.get(parentIndex).weight) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallest = index;

            if (leftChildIndex < heap.size() && heap.get(leftChildIndex).weight < heap.get(smallest).weight) {
                smallest = leftChildIndex;
            }

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).weight < heap.get(smallest).weight) {
                smallest = rightChildIndex;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        Edge temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
