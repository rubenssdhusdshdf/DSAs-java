/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stackexceptionsexample;

/**
 *
 * @author Hamilton
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MyStack {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Banana");
        myList.add("Kiwi");
        myList.add("Orange");
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an index position for an element in the list: ");
        int iIndex = keyboard.nextInt();

        try {
            if (iIndex < 0) {
                throw new StackUnderflow();
            } 
            else if (iIndex > myList.size()-1) {
                throw new StackOverflow();
            }          
            System.out.println("The element is " + myList.get(iIndex));
        } 
        catch (StackUnderflow | StackOverflow e) {
            System.out.println(e.getStackMsg());
        }
    }
}
