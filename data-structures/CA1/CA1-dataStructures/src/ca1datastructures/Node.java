/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1datastructures;

/**
 *
 * @author Ruben
 * @param <T>
 */

// Node implementation
public class Node<T>{
    T element; // List element
    Node<T> next; // sucessor link

    
    public Node (T el, Node<T> n) {
        element = el;
        next = n;
    }
    
    
    public Node (T el) {
    element = el;
    next = null;
    }

    // toString method to represent the Node

    @Override
    public String toString() {
        return "Node{" + "element=" + element + ", next=" + next + '}';
    }
    
    
}

