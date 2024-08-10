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
public class LinkedListDLLApp {
    public static void main(String[] args) {
        
        LinkedListDLL linkedDL = new LinkedListDLL();
        
        System.out.println("############### Start of DLL ################");        
        System.out.println("START of DLList, linkedDL..........");
        System.out.println("Is linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("linkedDL size: " + linkedDL.size());
        System.out.println("linkedDL.first: " + linkedDL.getFirst());
        System.out.println("linkedDL.last: " + linkedDL.getLast());
        System.out.println("linkedDL contains: " + linkedDL.toString());
        
        System.out.println("############### Test addFirst(Enda) ################");
        linkedDL.addFirst("Enda");
        System.out.println("Is linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("linkedDL size: " + linkedDL.size());
        System.out.println("linkedDL.first: " + linkedDL.getFirst());
        System.out.println("linkedDL.last: " + linkedDL.getLast());
        System.out.println("linkedDL contains: " + linkedDL.toString());
        
        System.out.println("############### Test add(Hermione) ################");
        linkedDL.add("Hermione");
        System.out.println("Is linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("linkedDL size: " + linkedDL.size());
        System.out.println("linkedDL.first: " + linkedDL.getFirst());
        System.out.println("linkedDL.last: " + linkedDL.getLast());
        System.out.println("linkedDL contains: " + linkedDL.toString());
        
        System.out.println("############### Test add(0, Bea)################");
        linkedDL.add(0, "Bea");
        System.out.println("Is linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("linkedDL size: " + linkedDL.size());
        System.out.println("linkedDL.first: " + linkedDL.getFirst());
        System.out.println("linkedDL.last: " + linkedDL.getLast());
        System.out.println("linkedDL contains: " + linkedDL.toString());
        
        System.out.println("############### Test add(3, Gabrielle)################");
        linkedDL.add(3, "Gabrielle");
        System.out.println("Is linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("linkedDL size: " + linkedDL.size());
        System.out.println("linkedDL.first: " + linkedDL.getFirst());
        System.out.println("linkedDL.last: " + linkedDL.getLast());
        System.out.println("linkedDL contains: " + linkedDL.toString());
        
        System.out.println("############### Test add(2, Fred)################");
        linkedDL.add(2, "Fred");
        System.out.println("Is linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("linkedDL size: " + linkedDL.size());
        System.out.println("linkedDL.first: " + linkedDL.getFirst());
        System.out.println("linkedDL.last: " + linkedDL.getLast());
        System.out.println("linkedDL contains: " + linkedDL.toString());
        
        System.out.println("############### Test get(4)################");
        System.out.println("get(4) ...should be Fred: " +linkedDL.get(4));
        System.out.println("Is linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("linkedDL size: " + linkedDL.size());
        System.out.println("linkedDL.first: " + linkedDL.getFirst());
        System.out.println("linkedDL.last: " + linkedDL.getLast());
        System.out.println("linkedDL contains: " + linkedDL.toString());
    }
}
