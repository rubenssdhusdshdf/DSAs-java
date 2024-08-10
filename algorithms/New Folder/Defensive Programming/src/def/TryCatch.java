/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package def;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class TryCatch {
    public static void main (String[] args) {
        // Declare numerator and denominator variables
        int iNumerator;
        int iDenominator = 0; // Initialize denominator to zero (this will cause an exception)
        
        // Prompt user for input
        System.out.println("Enter an integer number:");

        try {
            // Create a Scanner object to read input from the user
            Scanner keyboard = new Scanner(System.in);
            iNumerator = keyboard.nextInt();
            System.out.println("Say something");
            System.out.println(iNumerator / iDenominator);
            System.out.println("This text will not be shown");
        
        } catch (InputMismatchException error) {
            System.out.println("Anything");  
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
        
        finally {
            // This block will always be executed regardless of an exception
            System.out.println("This text will be shown NOw");
        }
    }
}
