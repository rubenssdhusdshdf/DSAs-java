package ds2;


// node implementation


class Node<T> {
    T element; // List element
    Node<T> next; // Reference to the next node in the list


    Node(T element) {
        this.element = element;
        this.next = null;
    }


    Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
}


// Interface implementation -> In Java an interface is a way to specify a set of methods that a class must implement
// without providing the actual implementation of those methods.
// This promotes a consistent structure and allows different classes to be used interchangeably if they implement
// the same interface
// purpose is abstraction: abstract operations that can be performed on a list without specifying how these operations
// should be performed
// Flexibility and interchangeability // different classes cna implement the List Interface in differeny ways
// Code reusability


interface List<T> {
    int size();
    boolean isEmpty();
    void add(T elem);
    void add(int index, T elem);
    T remove(int index);
    T remove(T target);
}


public class LinkedList<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;


    public LinkedList() {
        first = null;
        last = null;
    }


    @Override
    public int size() {
        int count = 0;
        Node<T> p = first;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }


    @Override
    public boolean isEmpty() {
        return first == null;
    }


    @Override
    public void add(T elem) {
        if (isEmpty()) {
            first = new Node<>(elem);
            last = first;
        } else {
            last.next = new Node<>(elem);
            last = last.next;
        }
    }


    @Override
    public void add(int index, T elem) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = new Node<>(elem, first);
            if (last == null) {
                last = first;
            }
            return;
        }
        Node<T> pred = first;
        for (int i = 0; i < index - 1; i++) {
            pred = pred.next;
        }
        pred.next = new Node<>(elem, pred.next);
        if (last == pred) {
            last = pred.next;
        }
    }


    @Override
    public T remove(int index) {
        // Can't remove from a negative index
        // Ok to add LL.size .. in effect adding to the end
        // Can't add to greater than the lenght of the LL
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
       
        T element; // placeholder for the data returned from remove method
        if (index == 0) {
            element = first.element; // if index is 0, we remove the first node in the list
            first = first.next;
            if (first == null) { // If is just one element in the list, and we remove, means that the list is now empty.
                // We need to look now at that situation.
                // If there was only one node in the list first.next would not point to anything, and therefore would be null.
                // We want to check if first is equal to null, then we need to set last = null.
                last = null;
            }
            return element; // if element is not 0, we return the element
        }
       
        // To remove a node other than the first
        // we need to find the predecessor of the element to be removed
        Node<T> pred = first;
        // Move the pred forward index -1 times using a for loop
        for (int i = 1; i <= index - 1; i++) {
            pred = pred.next;
        // Store the element to return
        }
        element = (T)pred.next.element; // return b from our example, T cast the value
        pred.next = pred.next.next; // Reroute - link around the node to be removed, a -> c
        if (pred.next == null) { // check if pred is the only node in the list
            last = pred;
        }
        return element;
    }


    @Override
    public T remove(T target) {
        Node<T> current = first;
        int index = 0;
        while (current != null && !current.element.equals(target)) {
            current = current.next;
            index++;
        }
        if (current != null && current.element.equals(target)) {
            return remove(index);
        }
        return null;
    }


    public Node<T> getFirst() {
        return first;
    }


    public void setFirst(Node<T> first) {
        this.first = first;
    }


    public Node<T> getLast() {
        return last;
    }


    public void setLast(Node<T> last) {
        this.last = last;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> p = first;
        while (p != null) {
            str.append(p.element).append(" ");
            p = p.next;
        }
        return str.toString().trim();
    }
}


