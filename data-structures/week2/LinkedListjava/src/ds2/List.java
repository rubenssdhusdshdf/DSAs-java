/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2;

/**
 *
 * @author User
 */
public interface List <T>{
    public int size(); // returns the number of elements in the list
    
    public boolean isEmpty(); // checks if the list is empty
    
    public void add(T elem); // Adds an element to the list
    
    public void add(int index, T elem); // Adds an element at a specified index in the list
    
    public T remove(int index); // Removes and returns the element at the specified index
    
    public T remove(T target); // Removes and returns the specified element
    
    public String toString(); // Returns a string representation of the list
}
