public class Node<T> {
    T element; // list element
    @SuppressWarnings("rawtypes")
    Node next; // sucessor link

    // constructor

    public Node(T element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node(T element) {
        this.element = element;
        next = null;
    }

//  public String toString() {
//       return "<Element: " + element + ">";
//    }

@Override 
public String toString() {
    return "Node {" + "element=" + element + ", next=" + next + '}';
}



}
