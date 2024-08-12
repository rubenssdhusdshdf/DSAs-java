/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author Ruben
 */
public class SubjectApp {
    public static void main(String[] args) {
        Subject ds = new Subject("Data Structures", 70.5);
        System.out.println("DS: " + ds.toString());
        
        Subject caos = new Subject("CAOS", 90.6);
        System.out.println("CAOS: " + caos.toString());
    }
}