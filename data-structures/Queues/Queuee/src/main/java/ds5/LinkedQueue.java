package ds5;
public class LinkedQueue <T> implements QueueInterface{ //If error appears in IDE, implement all abstract methods


    private QNode <T> first;
    private QNode <T> last;
   
    // Constructor


    public LinkedQueue() { // add code default cosntructor
        first = null; // manually added
        last = null; // manually added
    }
   


    @Override
    public void enqueue(Object elem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public Object dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public boolean isEmpty() {
        return first == null; // manually added from the default constructor, this mean null is empty
    }


    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    //Getters and setters


    public QNode<T> getFirst() {
        return first;
    }


    public void setFirst(QNode<T> first) {
        this.first = first;
    }


    public QNode<T> getLast() {
        return last;
    }


    public void setLast(QNode<T> last) {
        this.last = last;
    }
   
   


}


