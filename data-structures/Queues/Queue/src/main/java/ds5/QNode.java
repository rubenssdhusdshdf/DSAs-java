package ds5;

/**
 *
 * @author Ruben
 */
public class QNode<T> {
    // Declare variables
    T elemen;
    QNode<T> next;

    // constructors

    public QNode() {
    }

    public QNode(T elemen) {
        this.elemen = elemen;
    }

    public QNode(T elemen, QNode<T> next) {
        this.elemen = elemen;
        this.next = next;
    }

    // Override to String

    @Override
    public String toString() {
        return "QNode{" + "elemen=" + elemen + ", next=" + next + '}';
    }

}
