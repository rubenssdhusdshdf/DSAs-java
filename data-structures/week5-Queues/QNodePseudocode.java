public class QNode<T> {
    T elem;
    QNode<T> next;


    public QNode(T elem) {
        this.elem = elem;
        next = null;
    }


    public QNode(T elem, QNode<T> n) {
        this.elem = elem;
        this.next = n;
    }
}
