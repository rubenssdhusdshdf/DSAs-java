package com.mycompany.linearsearchexample;

public class LinearSearchExample {

    public static void main(String[] args) {
        MyArrayList<Integer> myList1 = new MyArrayList<>();
        myList1.add(99);
        myList1.add(6);
        myList1.add(86);
        myList1.add(15);
        myList1.add(58);
        myList1.add(35);
        myList1.add(87);
        myList1.add(0);
        myList1.add(4);

        System.out.println("The elements in list 1 are: " + myList1.toString());
        System.out.println("Unordered list - Linear Seach");
        Integer iKey1 = 58;
        System.out.println("Searching for number " + iKey1);

        int iPosition = myList1.unordered_sequentialSearch(iKey1);

        if (iPosition == -1) {
            System.out.println("The number " + iKey1.toString() + " was NOT found in the list!");
        } else {
            System.out.println("The number " + iKey1.toString() + " was found on position " + iPosition);
        }

        System.out.println("*********************");

        MyArrayList<Integer> myList2 = new MyArrayList<>();

        myList2.add(2);
        myList2.add(4);
        myList2.add(5);
        myList2.add(10);
        myList2.add(15);
        myList2.add(27);
        myList2.add(100);
        myList2.add(104);

        System.out.println("The elements in list 2 are: " + myList2.toString());
        System.out.println("Ordered list - Linear Seach");

        Integer iKey2 = 3;
        System.out.println("Searching for number " + iKey2);

        iPosition = myList2.ordered_sequentialSearch(iKey2);

        if (iPosition == -1) {
            System.out.println("The number " + iKey2.toString() + " was NOT found in the list!");
        } else {
            System.out.println("The number " + iKey2.toString() + " was found on position " + iPosition);
        }
    }
}

