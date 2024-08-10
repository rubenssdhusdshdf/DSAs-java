/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds3;

/**
 *
 * @author User
 */
public class DLNode <T>{
    T element;
    DLNode <T> next;
    DLNode <T> previous;

    public DLNode(T element, DLNode<T> next, DLNode<T> previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
    
    public DLNode(T element){
        this(element, null, null);
    }

    @Override
    public String toString() {
        return "DLNode{" + "element=" + element + ", next=" + next + '}';
    }
    
    
}
