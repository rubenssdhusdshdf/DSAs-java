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
public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList <Subject> llist1 = new LinkedList<>();
        
        System.out.println("######## Created LList #########");
        System.out.println("Is llist1 empty? " + llist1.isEmpty());
        System.out.println("LL size: " + llist1.size()); // 0
        
        System.out.println("##### Add first subject #####");
        Subject ds = new Subject("DS", 83.7);
        llist1.add(ds);
        System.out.println("Is LL empty: " + llist1.isEmpty()); // false
        System.out.println("LL size: " + llist1.size()); // 1
        System.out.println("LL: " + llist1.toString());
        
        System.out.println("##### Add second subject #####");
        Subject oop = new Subject("OOP", 63.5);
        llist1.add(oop);
        System.out.println("Is LL empty: " + llist1.isEmpty()); // false
        System.out.println("LL size: " + llist1.size()); // 1
        System.out.println("LL: " + llist1.toString());
        
        System.out.println("##### Remove subject #####");
        System.out.println("Remove DS: " + llist1.remove("DS"));
        System.out.println("Is LL empty: " + llist1.isEmpty()); // false
        System.out.println("LL size: " + llist1.size()); // 1
        System.out.println("LL: " + llist1.toString());
    }
}
