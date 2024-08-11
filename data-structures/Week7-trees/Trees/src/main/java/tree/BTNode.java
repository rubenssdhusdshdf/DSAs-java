package tree;

/**
 *
 * @author Ruben
 */

public class BTNode<T> {
    protected T elem;
    protected BTNode<T> left;
    protected BTNode<T> right;

    // Constructors
    public BTNode() {
    }

    public BTNode(T elem) {
        this.elem = elem;
    }

    public BTNode(T elem, BTNode<T> left, BTNode<T> right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    // toString

    @Override
    public String toString() {
        String leftVal = (left == null ? "NULL" : left.elem.toString()); // Manually added
        String rightVal = (right == null ? "NULL" : right.elem.toString()); // Manually added
        return "BTNode{" + "elem=" + elem + ", left=" + leftVal + ", right=" + rightVal + '}';
    }
}
