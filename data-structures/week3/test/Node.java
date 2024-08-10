/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author User
 */
public class Node<T> {
    T element; // list element
    Node next; // successor link

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    public Node(T element) {
        this.element = element;
        next = null;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + ", next=" + next + '}';
    }
}
