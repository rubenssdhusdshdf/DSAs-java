/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Ruben
 */
public class ArrayLists {
    public static void main (String[] args) {
        List<String> myList = new ArrayList<>();

        // populate the ArrayList
        myList.add("Enda");
        myList.add("Dublin");
        // myList.remove("Dublin") // this would remove Dublin from the list

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("myList " + (i + 1) + ": " + myList.get(i));
        }
        
        myList.add(2, myList.get(0)); // 
        myList.set(0, "DataStructures");
        System.out.println("After add/set");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("myList " + (i + 1) + ": " + myList.get(i));
        }  
    }
}
