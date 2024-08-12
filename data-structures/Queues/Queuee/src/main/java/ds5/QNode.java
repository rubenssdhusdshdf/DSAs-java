package ds5;

public class QNode<T> {
    // Declare variables
    T elem;
    QNode<T> next;
    
    // Constructors
    public QNode() {
        this.elem = null;
        this.next = null;
    }
    
    public QNode(T elem) {
        this.elem = elem;
        this.next = null;
    }
   
    public QNode(T elem, QNode<T> next) {
        this.elem = elem;
        this.next = next;
    }

    // Override toString
    @Override
    public String toString() {
        return "QNode{" + "elem=" + elem + ", next=" + next + '}';
    }
}
