/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LinkedListApp {
    public static void main(String[] args) {
        System.out.println("Start of LinkedList");
        LinkedList<String> linked = new LinkedList<>();

        System.out.println("Is List empty? " + linked.isEmpty());
        System.out.println("List size: " + linked.size());

        System.out.println("Adding \"Brian\" to the list");
        linked.add("Brian");

        System.out.println("**************************************");
        System.out.println("The size after adding Brian: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());

        System.out.println("Adding Ann using add(0, \"Ann\")");
        linked.add(0, "Ann");

        System.out.println("**************************************");
        System.out.println("The size after adding Ann: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());

        System.out.println("Adding \"Enda\" to the list");
        linked.add("Enda");

        System.out.println("**************************************");
        System.out.println("The size after adding Enda: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());

        System.out.println("Adding Carrie using add(2, \"Carrie\")");
        linked.add(2, "Carrie");

        System.out.println("**************************************");
        System.out.println("The size after adding Carrie: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());

        System.out.println("Adding Carrie using add(4, \"Fred\")");
        linked.add(4, "Fred");

        System.out.println("**************************************");
        System.out.println("The size after adding Fred: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());

        /*
         * // Check OOB for the Add method
         * System.out.println("Adding ZZTop using add(99, \"ZZTop\")");
         * linked.add(99, "ZZTop");
         * 
         * System.out.println("**************************************");
         * System.out.println("The size after adding ZZTop: " + linked.size());
         * System.out.println("The first element is: " + linked.getFirst());
         * System.out.println("The last element is: " + linked.getLast());
         * System.out.println("List contents: " + linked.toString());
         * 
         * // Check OOB for the Add method
         * System.out.println("Adding AAAstart using add(-1, \"AAAstart\")");
         * linked.add(-1, "AAAstart");
         * 
         * System.out.println("**************************************");
         * System.out.println("The size after adding AAAstart: " + linked.size());
         * System.out.println("The first element is: " + linked.getFirst());
         * System.out.println("The last element is: " + linked.getLast());
         * System.out.println("List contents: " + linked.toString());
         */
        // Test remove first node
        System.out.println("Remove first node");
        linked.remove(0);

        System.out.println("**************************************");
        System.out.println("The size after removing first node: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());

        // Test remove intermediate node
        System.out.println("Remove intermediate node");
        linked.remove(2);

        System.out.println("**************************************");
        System.out.println("The size after removing first node: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());

        // Test remove last node
        System.out.println("Remove last node");
        linked.remove(2);

        System.out.println("**************************************");
        System.out.println("The size after removing first node: " + linked.size());
        System.out.println("The first element is: " + linked.getFirst());
        System.out.println("The last element is: " + linked.getLast());
        System.out.println("List contents: " + linked.toString());
    }

}
