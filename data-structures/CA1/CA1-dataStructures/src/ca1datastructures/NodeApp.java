/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1datastructures;

/**
 *
 * @author Ruben */


public class NodeApp {
    public static void main(String[] args) {
        // Create nodes with Integer elements
        // <Integer> generics specifies we store integer values
        
        Node<Integer> node1 = new Node<>(1); //node1 with an element of 1
        Node<Integer> node2 = new Node<>(2); //node 2 with an element of 2
        Node<Integer> node3 = new Node<>(3); // node 3 with an element of 3
        
        // Link nodes are relationships of node, next refers to the point node1 points to 2, 
        // logically node 2 points to node 3, that's what code explaisn
        node1.next = node2;
        node2.next = node3;

        // Print details of nodes
        System.out.println("First node = " + node1); // Prints the node stored in var node1
        System.out.println("Second node = " + node2); // prints the node stored in var node2
        System.out.println("Third node = " + node3); // prints hte node stored in var node 3

        // Show linking between nodes
        System.out.println("Node 1 points to: " + node1.next); // It prints node 2 info
        System.out.println("Node 2 points to: " + node2.next); // it prints node 3 info
        System.out.println("Node 3 points to: " + node3.next); // it's null because after node3 is not a next node

        // next.next 
         System.out.println("Node 1 next.next node is: " + node1.next.next); // this means that we are printing
         // node3 because it's the next of 1, meaning 2, and the next of 2 meaning 3
    }
}