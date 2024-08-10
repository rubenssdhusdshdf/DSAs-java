/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben
 */

public class Test  {
    public static void print (List < String > arr) { 
                 
        for(String current : arr) {
            System.out.println(current) ;
}
}

public static void main(String [] args){

List <String> list  =  new ArrayList <>();

list.add ("Hello");

list.add ("World");
list.add ("bye");

Test.print(list); // the reason why we use test is a class name, it's an static class
// we only have static methods within it, we don't need to create an instance of that class
// in order to get access to the method in that class.

// normal for loop

for (int i = 0; i < list.size (); i++) {

System.out.println (list.get(i));

}

}

}

