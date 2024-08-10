/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stackexceptionsexample;

/**
 *
 * @author Hamilton
 */
public class StackException extends Exception {

    protected String msg;
    
    public StackException() {
        //empty constructor
    }

    public StackException(String msg) {
        super(msg);
        this.msg = msg;
    }
    
    public String getStackMsg() {
        return this.msg;
    }
}