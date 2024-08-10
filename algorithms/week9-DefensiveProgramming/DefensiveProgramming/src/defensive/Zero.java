/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptionsexamples;

/**
 *
 * @author Hamilton
 */
public class Zero {
   //-----------------------------------------------------------------
   //  Deliberately divides by zero to produce an exception.
   //-----------------------------------------------------------------
   public static void main(String[] args) {
      int iNumerator = 10;
      int iDenominator = 0;

      System.out.println ("Before the attempt to divide by zero.");
      System.out.println (iNumerator / iDenominator);
      System.out.println ("This text will not be printed.");
   }
}
