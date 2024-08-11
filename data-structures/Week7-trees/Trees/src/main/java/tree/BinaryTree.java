/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Ruben
 */

public interface BinaryTree <T extends Comparable<T>>{
    public void insert(T elem);
    
    public boolean isEmpty();
    
    public int size();
    
    public T findMax();
    
    public T findMin();
    
    public void inOrder();
    
    public boolean contains(T elem);
    
    public boolean remove(T elem);
}

