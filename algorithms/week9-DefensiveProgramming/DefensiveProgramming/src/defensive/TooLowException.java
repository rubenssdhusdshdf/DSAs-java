/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial1_exercises;

/**
 *
 * @author Hamilton1
 */
public class TooLowException  extends Exception {

    String msg;

    public TooLowException() {
        //empty constructor
    }

    public TooLowException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getLostMessage() {
        return this.msg;
    }
}