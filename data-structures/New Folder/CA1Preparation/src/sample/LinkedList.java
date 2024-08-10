/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author User
 */
public class LinkedList <T>{
    // variables
    Node<T> first;
    Node<T> last;
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void add(Subject module){
        if(isEmpty()){
            first = new Node(module, null);
            last = first;
        }
        else{
            Node<T> in = new Node<>(module, null);
            last.next = in;
            last = in;
        }
    }
    
    public int size(){
        if (isEmpty()){
            return 0;
        }
        else{
            Node <T> current = first;
            int count = 0;
            
            while(current != null){
                count++;
                current = current.next;
            }
            return count;
        }
    }
    
    public String remove(String target){
        Node <T> current = first;
        int counter = 0;
        boolean found = false;
        while(current.next != null){
            if(!current.sub.getModuleName().equalsIgnoreCase(target)){
                current = current.next;
            }
            else{
                found = true;
                break;
            }
        }
        
        if(found == false){
            return "Not found.....";
        }
        else{
            current = first;
            counter = 1;
            // the if part was missing....myBad :-) in this case trying to remove the first
            if(first.sub.getModuleName().equalsIgnoreCase(target)){
                first = first.next;
            }
            else{
                while(!current.sub.getModuleName().equalsIgnoreCase(target)){
                    counter++;
                    current = current.next;
                }
                if(counter == (size()-1)){
                    this.last = current;
                    this.last.next = null; // current.next = null
                }
                else{
                    current.next = current.next.next;
                }
            }
        }
        return "....removed..";
    }

    @Override
    public String toString() {
        String str = "List -> \n";
        Node<T> current = first;
        
        if(isEmpty()){
            return "The list is empty";
        }
        else{
            for(int i = 1; i <= size(); i++){
                str += i + ")" + current.toString() + "\n";
                current = current.next;
            }
            return str;
        }
    }
    
    
}
