/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds4;

/**
 *
 * @author User
 */
public class ArrayStack1 <T>{
    // Declare  in the stack - step 1 
    private int maxSize;
    private int top;
    private T[] items;
    
    // Constructor
    public ArrayStack1(int size){
        this.maxSize = size;
        this.top = -1;
        this.items = (T[])new Object[maxSize]; // casting
    }

    public ArrayStack1() {
    }
    
    // Stack structure
    public void push(T elem){
        if(top == (maxSize - 1)){
            throw new IndexOutOfBoundsException();
        }
        else{
            top++;
            items[top] = elem;
        }
    }
    
    // pop method
    public T pop(){
        if(top == -1){
            throw new IndexOutOfBoundsException();
        }
        else{
            T elem = items[top];
            top--;
            return elem;
        }
    }
    
    public T peek(){
        T elem;
        if (top == -1) {
            throw new IndexOutOfBoundsException();
        } else {
            elem = items[top];
            return elem;
        }        
    }

    // Getters and setters

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }
    
   

    // toString

    @Override
    public String toString() {
        String str = "Top\n";
        int counter = top;
        while(counter >= 0) {
            counter--;
            str += "\n" + items[counter];
        }
        return str + "\nBOTTOM";
               
    }
}
