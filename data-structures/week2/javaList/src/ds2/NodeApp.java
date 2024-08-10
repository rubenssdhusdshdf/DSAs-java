package ds2;


/**
 * Node Application to test Node class functionality.
 * Author: Ruben
 */
public class NodeApp {
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(100);


        System.out.println("First node = " + node.element + ", next = " + node.next);


        node.next = new Node<>(1001);
        System.out.println("First node = " + node.element + ", points to: " + node.next.element);


        System.out.println("Created node 1001, next node in list is: " + node.next);
        // This statement will correctly show null since node.next.next is null
        System.out.println("For node 100, the next.next node is: " + node.next.next);
    }
}
