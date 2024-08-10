/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1datastructures;

/**
 *
 * @author Ruben
 */
public class ArrayChecker {
    
// Given an array of ints, compute recursively if the array contains somewhere a value followed in the 
// array by that value, times 10, i.e. the numbers occur adjacently in the array. The return type is boolean.
// [Assumption: By convention consider only the part of the array that begins at the given index. In this 
// way, a recursive call can pass index+1 to move down the array. The initial call should pass in index 0.


    public static boolean containsValueFollowedByTimes10(int[] array) {
        //boolean indicates that the return type will indicate if the condition is true or false
        // int[] array specifies that the method operates on an array of integers
        
        return checkValueFollowedByTimes10(array, 0); 
        // I am being recursive, because a method calls itself to solve this problem
        // function search from index 0 of the array - meaning the first integer
        // method checks if is any value followed by other value multiplied for 10
    }

    // Recursive function to check from a given index
    private static boolean checkValueFollowedByTimes10(int[] array, int index) {
        // Base case: if we have less than 2 elements left to check, return false
        if (index >= array.length - 1) {
            return false;
        }
        
        // Check if the current element times 10 equals the next element
        if (array[index] * 10 == array[index + 1]) {
            return true;
        }
        
        // recursion, we are moving to the next element automatically, the function is being called itself
        // instead of doing it automatically
        return checkValueFollowedByTimes10(array, index + 1);
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 10, 3, 30}; // true, 1 followed by 10
        int[] array2 = {2, 20, 3, 4};  //true, 2 followed by 20
        int[] array3 = {4, 5, 6, 7};   // false because is not a value followed by other value multiplied for 10
        int[] array4 = {1, 100, 2, 20}; // true, because 2 is followed by 20
        int[] array5 = {};             //  false because the array is empty

        
        // The following code, prints the results in console , including three positive cases and two negative cases
        // in case of adding more arrays, implement an array in the main class and the system.out referencing the array var
        // could be a future improvement to listen user input and test dinamically if the condition is working
        System.out.println(containsValueFollowedByTimes10(array1)); 
        System.out.println(containsValueFollowedByTimes10(array2)); 
        System.out.println(containsValueFollowedByTimes10(array3)); 
        System.out.println(containsValueFollowedByTimes10(array4)); 
        System.out.println(containsValueFollowedByTimes10(array5)); 
    }
}
