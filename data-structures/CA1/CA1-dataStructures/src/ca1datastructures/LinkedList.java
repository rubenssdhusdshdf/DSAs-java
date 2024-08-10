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

public class LinkedList<T> { 
    private Node<T> first; // Reference to the first Node
    private Node<T> last;  // Reference to the last Node

    // Constructor to initialize an empty LinkedList
    public LinkedList() {
        first = null; // null value as default for the first node 
        last = null; // null value as default for the last node
    }

    // Method to check if the LinkedList is empty, true if list is empty. Otherwise
    // return false
    public boolean isEmpty() {
        return first == null;
    }

    // Method to get a project by its index
    public String getProject(int index) {
        if (index < 0 || index >= size()) {
            return "Incorrect index"; // Message displayed if the index is invalid
        }
        Node<T> current = first; // We start from the first node
        int count = 0;
        while (current != null) { // while current (first node) is not null, then if count (0) is equal to index, return the
            // project ot eh specified index
            if (count == index) {
                return current.element.toString();
            }
            count++; 
            current = current.next; // move to the next node
        }
        return "Project not found";
    }

    // Method to add a new project to the end of the LinkedList
    public void add(T element) {
        if (isEmpty()) {
            first = new Node<>(element); //// If the list is empty, set the first and last node to the new node
            last = first;
        } else {
            last.next = new Node<>(element); // Otherwise, link the new node to the end and update the last node
            last = last.next;
        }
    }

    // Method to add a project at a specific index
    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException(); //error index is invalid
        }
        if (index == 0) { // if index is equal to 0, insert node at the beginning
            first = new Node<>(element, first);
            if (last == null) {
                last = first; // if list was empty, update last node as well
            }
            return;
        }
        Node<T> pred = first;
        for (int i = 0; i < index - 1; i++) {
            pred = pred.next;
        }
        pred.next = new Node<>(element, pred.next);
        if (last == pred) {
            last = pred.next;
        }
    }

    // Method to remove the first occurrence of a project
    public T remove(T target) {
        Node<T> current = first;
        Node<T> prev = null;
        while (current != null && !current.element.equals(target)) {
            prev = current;
            current = current.next;
        }
        if (current != null && current.element.equals(target)) {
            if (prev == null) { // Removing the first node
                first = current.next;
                if (first == null) {
                    last = null;
                }
            } else { // Removing a node other than the first
                prev.next = current.next;
                if (current.next == null) {
                    last = prev;
                }
            }
            return current.element;
        }
        return null;
    }

    // Method to remove a project by index
    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            T removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return removedElement;
        }
        Node<T> pred = first;
        for (int i = 0; i < index - 1; i++) {
            pred = pred.next;
        }
        T removedElement = pred.next.element;
        pred.next = pred.next.next;
        if (pred.next == null) {
            last = pred;
        }
        return removedElement;
    }

    // Method to get the size of the LinkedList
    public int size() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Getter for the first node
    public Node<T> getFirst() {
        return first;
    }

    // Getter for the last node
    public Node<T> getLast() {
        return last;
    }

    // toString method to get a string representation of the LinkedList
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> current = first;
        while (current != null) {
            str.append(current.element.toString()).append(" ");
            current = current.next;
        }
        return str.toString().trim();
    }
}
