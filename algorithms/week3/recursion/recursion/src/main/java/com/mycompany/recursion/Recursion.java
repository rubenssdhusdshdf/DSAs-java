/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursion;


/**
 *
 * @author Ruben
 */
public class Recursion {

    public static int twoToThePowerOf(int iNumber) {
        // computes 2 to the power of iNumber
        if (iNumber == 0) {
            return 1; // base case
        } else {
            return 2 * twoToThePowerOf(iNumber - 1); // recursion case
        }
    }

    public static int power(int iBase, int iExponent) {
        if (iExponent == 0) {
            return 1; // base case
        } else if (iExponent == 1) { // base case
            return iBase;
        } else {
            return iBase * power(iBase, iExponent - 1); // recursive case
        }
    }

    public static boolean isPalindrome(String sString) {
        // determine if a string is palindrome
        if (sString.length() <= 1) {
            // base case
            return true;
        } else if (sString.charAt(0) != sString.charAt(sString.length() - 1)) {
            return false;
        } else {
            // recursive case
            return isPalindrome(sString.substring(1, sString.length() - 1));
        }
    }

    public static void reverse(String sString) {
        if (sString.length() == 1) {
            // base case
            System.out.print(sString.charAt(0));
        } else {
            // recursive case
            // print char at last index
            System.out.print(sString.charAt(sString.length() - 1));
            // call the function again with the last char removed
            reverse(sString.substring(0, sString.length() - 1));
        }
    }

    public static void main(String[] args) {
        int iNumber = 3;
        int iResult = twoToThePowerOf(iNumber);
        System.out.println("2 to the power of " + iNumber + " is: " + iResult);

        System.out.println("3 to the power of 2 is: " + power(3, 2)); // should print 9
        
        String sMyWord = "level";
        System.out.println(sMyWord + " is palindrome? - " + isPalindrome(sMyWord));
        
        System.out.print("Reverse of 'hello' is: ");
        reverse("hello"); // should print "olleh"
        System.out.println(); // for new line
    }
}
