package ds2;


/**
 * Represents a node in a linked list.
 * @param <T> the type of the element stored in the node
 */
public class Node<T> {
    T element; // List element
    Node<T> next; // Reference to the next node in the list
   
    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
   


    public Node(T element) {
        this(element, null);
    }


    public Node() {
        this(null, null);
    }
   
    @Override
    public String toString() {
        return "Node {" + "element=" + element + ", next=" + next + '}';
    }
}