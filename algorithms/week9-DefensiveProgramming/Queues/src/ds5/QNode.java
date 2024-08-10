package ds5;

/**
 *
 * @author Ruben
 */
public class QNode <T> {
    // Decalrare variables
    T elem;
    QNode <T> next;
    
    // Constructors 
    // default constructor

    public QNode() {
    }
    
    
    // for elem var
    public QNode(T elem) {
        this.elem = elem;
        next = null; 
    }
    
    // for var declared
    public QNode(T elem, QNode<T> next) {
        this.elem = elem;
        this.next = next;
    }
    
    //Overrride to String

    @Override
    public String toString() {
        return "QNode{" + "elem=" + elem + ", next=" + next + '}';
    }
    

}
