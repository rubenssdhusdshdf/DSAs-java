/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quickSort;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class PerfAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iNumberOfElements = 1000;

        MyArrayList<Integer> myList1;
        MyArrayList<Integer> myList2;
        MyArrayList<Integer> myList3;
        MyArrayList<Integer> myList4;

        myList1 = new MyArrayList<>();
        myList2 = new MyArrayList<>();
        myList3 = new MyArrayList<>();
        myList4 = new MyArrayList<>();

        //pupulate the collection with a large number of elements
        for (int iCount = 0; iCount < iNumberOfElements; iCount++) {
            int randomNum = (int) (Math.random() * 10000);
            myList1.add(randomNum);
            myList2.add(randomNum);
            myList3.add(randomNum);
            myList4.add(randomNum);
        }

        long lStartTime = System.currentTimeMillis();
        myList1.quickSort(0, iNumberOfElements - 1);
        long lEndTime = System.currentTimeMillis();
        long lDuration = lEndTime - lStartTime;

        System.out.println("Quick Sort of " + myList1.size() + " elements took " + lDuration + " milliseconds");

        lStartTime = System.currentTimeMillis();
        myList2.mergeSort(0, iNumberOfElements - 1);
        lEndTime = System.currentTimeMillis();
        lDuration = lEndTime - lStartTime;

        System.out.println("Merge Sort of " + myList1.size() + " elements took " + lDuration + " milliseconds");

        lStartTime = System.currentTimeMillis();
        myList3.bubbleSort();
        lEndTime = System.currentTimeMillis();
        lDuration = lEndTime - lStartTime;

        System.out.println("Bubble Sort of " + myList2.size() + " elements took " + lDuration + " milliseconds");

        lStartTime = System.currentTimeMillis();
        myList4.insertionSort();
        lEndTime = System.currentTimeMillis();
        lDuration = lEndTime - lStartTime;

        System.out.println("Insertion Sort of " + myList4.size() + " elements took " + lDuration + " milliseconds");
    }
}
