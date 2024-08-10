/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearch;

/**
 *
 * @author Hamilton1
 */
public class BinarySearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iPosition;
        MyArrayList<Integer> myList = new MyArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(27);
        myList.add(100);
        myList.add(104);

        System.out.println("The elements in the list are: " + myList.toString());
        Integer iKey1 = 10;
        System.out.println("Searching for number " + iKey1 + " using non-recursive");

        iPosition = myList.binarySearch_nonRecursive(iKey1, 0, myList.size() - 1);

        if (iPosition == -1) {
            System.out.println("The number " + iKey1.toString() + " was NOT found in the list!");
        } else {
            System.out.println("The number " + iKey1.toString() + " was found!");
        }

        System.out.println("*********************");
        
        System.out.println("Searching for number " + iKey1 + " using recursive");
        iPosition = myList.binarySearch_recursive(iKey1, 0, myList.size() - 1);

        if (iPosition == -1) {
            System.out.println("The number " + iKey1.toString() + " was NOT found in the list!");
        } else {
            System.out.println("The number " + iKey1.toString() + " was found!");
        }
    }
}
