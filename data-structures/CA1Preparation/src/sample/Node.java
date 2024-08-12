/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author Ruben
 */
public class Node <T>{
    Subject sub;
    Node<T> next;
    
    
    // constructor

    public Node(Subject sub, Node<T> next) {
        this.sub = sub;
        this.next = next;
    }
    
    // Getters and setters

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    // ToString

    @Override
    public String toString() {
        return "Node{" + "sub=" + sub + ", next=" + next + '}';
    }
    
    
}
