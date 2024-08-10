/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 *
 * @author Hamilton1
 */
public class Task3 {
    public static void main(String[] args) {
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a float number");
            try {
                float fBase = keyboard.nextFloat();
                double dTheRoot = squareThis(fBase);
                System.out.println("The square root of " + fBase + " is " + dTheRoot);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Not a POSITIVE float. Try again");
            } catch (InputMismatchException e) {
                System.out.println("Not a FLOAT");
            }
        }
    }
    
    private static double squareThis(float fBase) throws ArithmeticException {
        if (fBase < 0) {
            throw new ArithmeticException();
        } else {
            return sqrt(fBase);
        }
    }      
}





