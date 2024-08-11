public class BTNode<T> {
    protected T element;
    protected BTNode<T> left;
    protected BTNode<T> right;

    public BTNode(T element) {
        this.element = element;
    }
}
