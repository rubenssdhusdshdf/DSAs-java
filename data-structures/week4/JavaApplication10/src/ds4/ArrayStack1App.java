/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds4;

/**
 *
 * @author Ruben
 */
public class ArrayStack1App {
    public static void main(String[] args){
        ArrayStack1 <String> aStack = new ArrayStack1<>(10); // 10 for max value
        System.out.println("###### Created ArrayStack1 aStack ######");
        System.out.println("The stack contains " + aStack.toString());
        
        System.out.println("...popping" + aStack.pop());
    }
}
