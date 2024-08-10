/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Hamilton1
 */
public class Task1 {

    public static void main(String[] args) {
        int iNumber1 = 0;
        int iNumber2 = 0;
        int iSum =0;
        boolean bWrongInput;
        
        System.out.println("Hello and welcome!");
        
        do{
            bWrongInput = false;
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter the first integer number:");
                iNumber1 = keyboard.nextInt();
            }
            catch (InputMismatchException e){
                bWrongInput = true;
                System.out.println("Not an integer!");
            }
        } while (bWrongInput);
        

        do{
            bWrongInput = false;
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter the second integer number:");
                iNumber2 = keyboard.nextInt();
            }
            catch (InputMismatchException e){
                bWrongInput = true;
                System.out.println("Not an integer!");
            }
        } while (bWrongInput);


        iSum = iNumber1 + iNumber2;
        System.out.println("The sum of " + iNumber1 + " and " + iNumber2 + " is " + iSum);
    }
}
