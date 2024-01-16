/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.openclosechar;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author quoch
 */
class Node{
    private char c;
    public Node(char c){
        this.c = c;
    }
    public Node next;
}
class Stack{
    private Node head;
    public Stack(){
        head = null;
    }
    public void push(Node node){
        if(node == null) return;
        node.next = head;
        head = node;
    }
    public Node pop(){
        Node node = null;
        if(head != null){
            node = head;
            head = head.next;
        }
        return node;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public Node top(){
        return head;
    }
}
class CharValidator{
    private Hashtable<String, String> hashtable;
    public CharValidator(){
        hashtable = new Hashtable<String, String>();
        hashtable.put("{","}");
        hashtable.put("[","]");
        hashtable.put("(",")");
    }
    public boolean equals(char open, char close){
        return hashtable.get(Character.toString(open)).equals(Character.toString(close));
    }
    public boolean isOpenChar(char input){
        return hashtable.get(Character.toString(input)) != null;
    }
    public boolean isCloseChar(char input){
        return hashtable.get(Character.toString(input)) != null;
    }
}
public class OpenCloseChar {
    public String getInput(){
        System.out.println("Input your string: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        CharValidator validator = new CharValidator();
        Stack stack = new Stack();
        OpenCloseChar occ = new OpenCloseChar();
        String input = occ.getInput();
        for(int i =0; i<input.length(); i++){
            if(validator.isOpenChar(input.charAt(i)))
                stack.push(new Node(input.charAt(i)));
            if(validator.isCloseChar(input.charAt(i))){
                // nếu gặp ngoặc đóng thì làm gì ở đây
            }
        }
        
    }
}
