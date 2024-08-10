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
public class LinkedListDLL <T> implements DLList<T>{
    private DLNode <T> first;
    private DLNode <T> last;

    public LinkedListDLL() {
    }

    public LinkedListDLL(DLNode<T> first, DLNode<T> last) {
        this.first = first;
        this.last = last;
    }
    
    @Override
    public int size() {
        int count = 0;
        DLNode<T> current = first;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void add(T element) {
        if(first == null){
            first = new DLNode<>(element, first, null);
            last = first;
        }
        else{
            last = new DLNode<>(element, null, last);
            last.previous.next = last;
        }    
    }

    @Override
    public void addFirst(T element) {
        if(first == null){
            first = new DLNode<T>(element, first, null);
            last = first;
        }
        else{
            first = new DLNode<T>(element, first, null);
            first.next.previous = first;
        }
    }

    @Override
    public void add(int index, T element) {
        // Can't add to a negative index
        // Ok to add to LL.size...in effect adding to the end
        // Can't add to greater than the length of the LL
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        
        if (index == 0) {
            first = new DLNode<>(element, first, null);
            if(last == null){
                last = first;
            }
            return;
        }  
        
        if(index == size()){
            last = new DLNode<>(element, null, last);
            last.previous.next = last;
            return;
        }
        
        DLNode<T> pred = first;
        for (int i = 0; i < index-1; i++){
            pred = pred.next;
        }
        
        DLNode <T> insert = new DLNode(element, pred.next, pred); 
        pred.next = insert;
        insert.next.previous = insert;
    }

    @Override
    public void remove(int index) {
        // If the index is less than 0 or greater than the size, 
        // then throw exception
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        
        // Now check where in the list the index is to be removed from
        // Is it the first? Re-org so that the old 2nd node becomes the first, 
        // and that the old 2nd prev link, is set to null 
        if (index == 0){
            // if there was only one element in the list,
            // then also set last = null
            if(first == last){
                first = null;
                last = null;
            }
            // Otherwise you have a list with more than 2 elements
            // The (old) second now becomes the first and its prev = null 
            // ..............as it is now the first
            else{
                first.next.previous = null;
                first = first.next;            
            }
        }
        // Now check if node to be removed is the last in the list
        // If so then the old 2nd last becomes the last 
        // and old 2nd last next node is now null
        else if (index == (size() - 1)){
            last.previous.next = null;
            last = last.previous;
        }
        // otherwise it is an intermediate node that is to be removed
        else{    
            // First find the node associated with this index
            DLNode<T> pred = first;
            for (int i = 0; i < (index - 1); i++) {
                pred = pred.next;
            }
            // Now have the pointer to the pred of node to be removed
            // Now move links around
            // pred.next = index.next, so skip the node to be removed
            // pred.next.prev = pred
            pred.next = pred.next.next; //set forward link A ====> C
            
            // pred.next is now (old) successor/index.next
            pred.next.previous = pred; //set backward link from (old) succ to pred           
        }                          // A <==== C    }
    } // remove

    @Override
    public DLNode<T> get(int index) {
        DLNode<T> fetch = first;
        for (int i = 0; i < index; i++){
            fetch = fetch.next;
        }    
        return fetch;
    }

    @Override
    public void addBefore(T target, T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DLNode<T> getFirst() {
        return first;
    }

    public void setFirst(DLNode<T> first) {
        this.first = first;
    }

    public DLNode<T> getLast() {
        return last;
    }

    public void setLast(DLNode<T> last) {
        this.last = last;
    }

    @Override
    public String toString() {
        String output;
        
        DLNode <T> p = first;
        output = "LinkedListDLL{\n";
        while (p != null){
            output += " " + p.element;
            p = p.next;
        }
        return output + "\n}";
    }
    
    
}
