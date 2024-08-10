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

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Guess a randomly generated number between 0 and 9");
        try {
            Scanner keyboard = new Scanner(System.in);
            long lRandomNumber  = Math.round(Math.random() * 10);
            System.out.println("The randomly generated number is " + lRandomNumber);
            System.out.println("You cheater!");
            
            System.out.println("Enter an integer number between 0 and 9: ");
            int iUserNumber = keyboard.nextInt();

            if (iUserNumber > 9 || iUserNumber < 0 ) {
                throw new TooBigException();
            }
            else if (iUserNumber > lRandomNumber) {
                throw new TooBigException("Too big. The random number was " + lRandomNumber);
            }
            else if (iUserNumber < lRandomNumber) {
                throw new TooLowException("Too low. The random number was " + lRandomNumber);
            }
            System.out.println("Congratulations! You guessed!");
        }
        catch (InputMismatchException e) {
            System.out.println("Error! You did not enter a valid number!");
        }
        catch (TooBigException e) {
            System.out.println(e.getLostMessage());
        }
        catch (TooLowException e) {
            System.out.println(e.getLostMessage());
        }        
    }
}

