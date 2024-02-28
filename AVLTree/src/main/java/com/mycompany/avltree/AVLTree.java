/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avltree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;
    
    public Menu(){}
    
    public Menu(String td, String[] mc){
        title=td;
        mChon= new ArrayList<>();
        for(String s:mc) mChon.add((T) s);
    }
//-------------------------------------------
    public void display(){
        System.out.println(title);
        System.out.println("--------------------------------");
        for(int i=0; i<mChon.size();i++)
            System.out.println((i+1)+"."+mChon.get(i));
        System.out.println("--------------------------------");
    }
//-------------------------------------------
    public int getSelected(){
        display();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter selection..");
        return sc.nextInt();
    }
//-------------------------------------------
    public abstract void execute(int n);
//-------------------------------------------
    public void run(){
        while(true){
            int n=getSelected();
            execute(n);
            if(n>mChon.size()) break;
        }
    }
//-------------------------------------------    
}
class Plannet{
    private String name;
    private double mass, ed, au, jy;

    public Plannet(String name, double mass, double ed, double au, double jy) {
        this.name = name;
        this.mass = mass;
        this.ed = ed;
        this.au = au;
        this.jy = jy;
    }

    public String getName() {
        return name;
    }
    
}
class Node {
    int height;
    Plannet contact;
    Node left, right;

    Node(Plannet contact) {
        this.contact = contact;
        this.height = 1;
    }
    
    public String getKey(){
        return this.contact.getName();
    }
}

public class AVLTree {
    private Node root;

    // Get height of a node
    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Get balance factor of a node
    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Update height of a node
    private void updateHeight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    // Right rotate a subtree rooted with y
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        updateHeight(y);
        updateHeight(x);

        return x;
    }

    // Left rotate a subtree rooted with x
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        updateHeight(x);
        updateHeight(y);

        return y;
    }

    // Insert a key into the AVL tree
    public void insert(Plannet contact) {
        root = insert(root, contact);
    }

    private Node insert(Node node, Plannet contact) {
        // Perform standard BST insertion
        if (node == null) {
            return new Node(contact);
        }

        if (contact.getName().compareTo(node.getKey()) < 0) {
            node.left = insert(node.left, contact);
        } else if (contact.getName().compareTo(node.getKey()) > 0) {
            node.right = insert(node.right, contact);
        } else {
            // Duplicate keys are not allowed
            return node;
        }

        // Update height of current node
        updateHeight(node);

        // Get the balance factor
        int balance = getBalance(node);

        // Perform rotations if needed
        if (balance > 1 && contact.getName().compareTo(node.left.getKey()) < 0) {
            return rightRotate(node);
        }
        if (balance < -1 && contact.getName().compareTo(node.right.getKey()) > 0) {
            return leftRotate(node);
        }
        if (balance > 1 && contact.getName().compareTo(node.left.getKey()) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && contact.getName().compareTo(node.right.getKey()) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // No rotation needed
        return node;
    }
    
    public Node search(String name, Node node){
        if(node == null) return null;
        if(node.getKey().compareTo(name) > 0) return search(name, node.right);
        else if(node.getKey().compareTo(name) < 0) return search(name, node.left);
        else return node;
//        return null;
    }
    
    public Node search(String name){
        if(root == null) return null;
        if(root.getKey().compareTo(name) > 0) return search(name, root.right);
        else if(root.getKey().compareTo(name) < 0) return search(name, root.left);
        else return root;
    }
    
    // Delete a key from the AVL tree
    public void delete(String name) {
        root = delete(root, name);
    }

    private Node delete(Node node, String name) {
        // Perform standard BST delete
        if (node == null) {
            return node;
        }
        
        if (name.compareTo(node.getKey()) < 0) {
            node.left = delete(node.left, name);
        } else if (name.compareTo(node.getKey()) > 0) {
            node.right = delete(node.right, name);
        } else {
            // Node with the key found, perform deletion

            // Case 1: Node with only one child or no child
            if ((node.left == null) || (node.right == null)) {
                Node temp = (node.left != null) ? node.left : node.right;

                // No child case
                if (temp == null) {
                    temp = node;
                    node = null;
                } else { // One child case
                    node = temp; // Copy the contents of the non-empty child
                }

                // Update height of current node
                updateHeight(node);

            } else {
                // Case 2: Node with two children

                // Find the inorder successor (smallest node in the right subtree)
                Node temp = findMin(node.right);

                // Copy the inorder successor's data to this node
                node.contact = temp.contact;

                // Delete the inorder successor
                node.right = delete(node.right, temp.getKey());
            }
        }

        // If the tree had only one node, return
        if (node == null) {
            return node;
        }

        // Update height of the current node
        updateHeight(node);

        // Get the balance factor
        int balance = getBalance(node);

        // Perform rotations if needed
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) {
            return leftRotate(node);
        }
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Helper method to find the node with the minimum key in the AVL tree
    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Inorder traversal to print the tree
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.getKey() + " ");
            inorder(node.right);
        }
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.getKey());
        }
    }
    abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;
    
    public Menu(){}
    
    public Menu(String td, String[] mc){
        title=td;
        mChon= new ArrayList<>();
        for(String s:mc) mChon.add((T) s);
    }
//-------------------------------------------
    public void display(){
        System.out.println(title);
        System.out.println("--------------------------------");
        for(int i=0; i<mChon.size();i++)
            System.out.println((i+1)+"."+mChon.get(i));
        System.out.println("--------------------------------");
    }
//-------------------------------------------
    public int getSelected(){
        display();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter selection..");
        return sc.nextInt();
    }
//-------------------------------------------
    public abstract void execute(int n);
//-------------------------------------------
    public void run(){
        while(true){
            int n=getSelected();
            execute(n);
            if(n>mChon.size()) break;
        }
    }
//-------------------------------------------    
}
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(new Plannet("Mercury", 0.383, 0.06, 0.39, 0.24));
        avlTree.insert(new Plannet("Venus", 0.949, 0.81, 0.72, 0.62));
        avlTree.insert(new Plannet("Earth", 1.000, 1.00, 1.00, 1.00));
        avlTree.insert(new Plannet("Mars", 0.532, 0.11, 1.52, 1.88));
        avlTree.insert(new Plannet("Jupiter", 11.209, 317.83, 5.20, 11.86));
        avlTree.insert(new Plannet("Saturn", 9.449, 95.16, 9.54, 29.45));
        avlTree.insert(new Plannet("Uranus", 4.007, 14.54, 19.19, 84.02));
        avlTree.insert(new Plannet("Saturn", 3.883, 17.15, 30.07, 164.79));
    }
}
