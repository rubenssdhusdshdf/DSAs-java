/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tutorial1_exercises;

/**
 *
 * @author Hamilton
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
       ArrayList<Integer> myList = new ArrayList<>();
        int iIndex = 0;
        boolean bNotOk;
        // Initialise the ArrayList
        for (int iCount = 0; iCount < 100; iCount++) {
            int iRandomNumber = (int) (Math.random() * 10000);
            myList.add(iRandomNumber);
        }
        do {
            bNotOk = false;
            try {
                System.out.println("Enter an integer number between 0 and 99: ");
                Scanner keyboard = new Scanner(System.in);
                iIndex = keyboard.nextInt();
            } 
            catch (InputMismatchException e) {
                bNotOk = true;
                System.out.println(iIndex + " is not a number");
            }
        } while (bNotOk);

        try {
            System.out.println("The corresponding element in the array is " + myList.get(iIndex));
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println(iIndex + " is not an integer between 0 and 99");
        }
    }
}
