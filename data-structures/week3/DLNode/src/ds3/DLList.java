/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds3;

/**
 *
 * @author User
 * @param <T>
 */
public interface DLList <T>{
    public int size();
    
    public boolean isEmpty();
    
    public void add(T element);
    
    public void addFirst(T element);
    
    public void add(int index, T element);
    
    public void remove(int index);
    
    public DLNode<T> get(int index);
    
    public void addBefore(T target, T element);
}
