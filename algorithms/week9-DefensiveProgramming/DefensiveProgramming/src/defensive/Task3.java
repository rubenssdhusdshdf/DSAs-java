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

public class Task3 {

    public static void main(String[] args) {
    System.out.println("Let's try the square root operation!");
        try {
            System.out.println("Enter a positive number: ");
            Scanner keyboard = new Scanner(System.in);
            float fNumber = keyboard.nextFloat();

            if (fNumber < 0) {
                throw new ArithmeticException("Cannot perform this operation with a negative number");
            }
            System.out.println("The squared root of " + fNumber + " is " + Math.sqrt(fNumber));
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
        catch (InputMismatchException e) {
            System.out.println("You did not enter a number");
        }
    }
}
