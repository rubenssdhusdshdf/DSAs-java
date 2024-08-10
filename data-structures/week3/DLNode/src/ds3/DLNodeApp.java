/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds3;

/**
 *
 * @author User
 */
public class DLNodeApp {
    public static void main(String[] args) {
        DLNode <String> bill = new DLNode("Bill");
        System.out.println("DLNode bill: " + bill.toString());

        DLNode<String> hermione = new DLNode("Hermione");
        System.out.println("DLNode hermione: " + hermione.toString());

        DLNode<String> frank = new DLNode("Frank", hermione, bill);
        System.out.println("DLNode frank: " + frank.toString());        
    }
}
