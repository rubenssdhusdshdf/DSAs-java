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

public class Task1 {

    public static void main(String[] args) {
        int iNumber1 = 0;
        int iNumber2 = 0;
        System.out.println("Let's add two integer numbers together!");

        boolean bNotOk;
        do {
            bNotOk = false;
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter the first integer number: ");
                iNumber1 = keyboard.nextInt();
            } catch (InputMismatchException e) {
                bNotOk = true;
                System.out.println("Not an integer! Try again... ");
            } finally {
                System.out.println();
            }
        } while (bNotOk);

        do {
            bNotOk = false;
            try {
                System.out.println("Enter the second integer number: ");
                Scanner keyboard = new Scanner(System.in);
                iNumber2 = keyboard.nextInt();
            } catch (InputMismatchException e) {
                bNotOk = true;
                System.out.println("Not an integer! Try again... ");
            } finally {
                System.out.println();
            }
        } while (bNotOk);

        System.out.println("The sum of " + iNumber1 + " + " + iNumber2 + " is " + (iNumber1 + iNumber2));
    }
}
