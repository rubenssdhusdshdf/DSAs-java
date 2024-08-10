/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hamilton1
 */
public class Task2 {
    public static void main(String[] args) {
       Random randomObject = new Random();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int iCount = 0; iCount < 100; iCount++) {
            int iRandomNumber = randomObject.nextInt(10000);
            //int iRandomNumber = (int)(Math.random()* 10000);
            myList.add(iRandomNumber);
        }
        while (true) {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Please enter an integer number between 0 and 99");
                int iIndex = keyboard.nextInt();
                System.out.println("The number at index " + iIndex + " is " + myList.get(iIndex));
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Not a number. Try again!");
            } 

            catch (IndexOutOfBoundsException e) {
                System.out.println("Your number is not between 0 and 99");
            }           
        } 
        System.out.println("Thanks, good night!");
    }           
}






        
 