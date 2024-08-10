/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruben
 */

// Node implementation


public class DLNode<T> {
    T element;
    DLNode<T> next;
    DLNode<T> previous;


    public DLNode(T element, DLNode<T> next, DLNode<T> previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }


    public DLNode(T element) {
        this(element, null, null);
    }


    @Override
    public String toString() {
        return "DLNode{" + "element=" + element + ", next=" + next + '}';
    }
}




