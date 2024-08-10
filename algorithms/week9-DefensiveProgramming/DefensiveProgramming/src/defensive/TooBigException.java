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
public class TooBigException extends Exception {

    String msg = "Your number is not between 0 and 9!";

    public TooBigException() {
        //empty constructor
    }

    public TooBigException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getLostMessage() {
        return this.msg;
    }
}

