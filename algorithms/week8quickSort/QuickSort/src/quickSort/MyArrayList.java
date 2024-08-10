/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quickSort;

import java.util.*;

/**
 *
 * @author Hamilton1
 * @param <ElementType>
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {

    public void quickSort(int iStart, int iEnd) {
        int iPivotIndex;
        if (iStart < iEnd) {
            /*
                select pivot and re-arrange elements in two partitions such as
                all array[start … p-1] are less than pivot = array [p] and
                all array[p+1 … end] are >= pivot
             */
            iPivotIndex = partition(iStart, iEnd);

            // sort first partition of the array (from start to pivot_index-1)
            quickSort(iStart, iPivotIndex - 1);

            //sort second partition of the array
            quickSort(iPivotIndex + 1, iEnd);
        } else // do nothing, the array has one element, so it is sorted
        {
            return; //this return statement is not reallz neccessary, but I added here for improved clarity
        }
    }

    public int partition(int iStart, int iEnd) {
        int iUp, iDown;
        ElementType pivot;

        // select the first element as pivot
        pivot = get(iStart);

        // set the UP and DOWN indexes
        iUp = iStart;
        iDown = iEnd;

        // as long as UP and DOWN indexes did not pass each other
        while (iUp < iDown) {
            // increment UP index until found first element higher than pivot
            while (iUp < iEnd && ((Comparable) get(iUp)).compareTo((Comparable) pivot) <= 0) {
                iUp = iUp + 1;
            }

            // decrement DOWN until found first element smaller than  pivot
            while (iDown > iStart && (((Comparable) get(iDown)).compareTo((Comparable) pivot) >= 0)) {
                iDown = iDown - 1;
            }

            // if UP and DOWN indexes did not pass each other
            if (iUp < iDown) {
                ElementType elementUp = get(iUp);
                //swap the two elements found
                set(iUp, get(iDown));
                set(iDown, elementUp);
            }
        }

        // UP and DOWN indexes have passed each other, so swap pivot with the element on DOWN position
        set(iStart, get(iDown));
        set(iDown, pivot);
        return iDown;
    }

    //Merge Sort Algorithm
    public void mergeSort(int iStart, int iEnd) {
        int iMiddle;
        if (iStart < iEnd) {
            // middle in the middle between start and end is determined
            iMiddle = (iStart + iEnd) / 2;

            // first part of the array (from start to mid) sorted by recursive calls
            mergeSort(iStart, iMiddle);

            // second part of the array (from mid+1 to end) sorted by recursive calls of merge(array, start, mid, end)
            mergeSort(iMiddle + 1, iEnd);

            // merges array [start .. mid] with array[mid+1.. end]
            merge(iStart, iMiddle, iEnd);
        } else {
            // do nothing, the array has one element, so it is sorted
            return; //this return statement is not reallz neccessary, but I added here for improved clarity
        }
    }

    //Merge Sort Algorithm - Merging process
    public void merge(int iLeft, int iMiddle, int iRight) {
        int iCount = iLeft;
        int jCount = iMiddle + 1;
        int kCount = 0;
        ArrayList<Object> tempArray = new ArrayList<>();

        while (iCount <= iMiddle && jCount <= iRight) {
            if (((Comparable) get(iCount)).compareTo((Comparable) get(jCount)) < 0) {
                tempArray.add(kCount, get(iCount));
                iCount = iCount + 1;
            } else {
                tempArray.add(kCount, get(jCount));
                jCount = jCount + 1;
            }
            kCount = kCount + 1;
        }

        // there are elements left in 1st half to be copied
        while (iCount <= iMiddle) {
            tempArray.add(kCount, get(iCount));
            kCount = kCount + 1;
            iCount = iCount + 1;
        }

        // there are elements left in 2nd half to be copied
        while (jCount <= iRight) {
            tempArray.add(kCount, get(jCount));
            kCount = kCount + 1;
            jCount = jCount + 1;
        }

        // copy the sorted tempArray into the original array
        for (iCount = iLeft, kCount = 0; iCount <= iRight; iCount++, kCount++) {
            set(iCount, (ElementType) tempArray.get(kCount));
        }
    }

    // Efficient Bubble Sort. It recognises that after each pass of the outer loop
    // an additional rightmost element is in the correct position and can be ignored
    public void bubbleSort() {
        int iCount, jCount;
        Comparable elementAtJCount, elementAtJPlus;
        for (iCount = 0; iCount < size(); iCount++) {

            for (jCount = 0; jCount < size() - 1 - iCount; jCount++) {
                elementAtJCount = (Comparable) get(jCount);
                elementAtJPlus = (Comparable) get(jCount + 1);

                if (elementAtJCount.compareTo(elementAtJPlus) > 0) {
                    //swap element on postion jCount with element on position jCount + 1
                    swap(jCount, jCount + 1);
                }
            }
        }
    }

    // Efficient Bubble Sort - Swapping
    public void swap(int iInPos1, int iInPos2) {
        ElementType objectAtPos1 = get(iInPos1);
        ElementType objectAtPos2 = get(iInPos2);

        remove(iInPos1);
        add(iInPos1, objectAtPos2);
        remove(iInPos2);
        add(iInPos2, objectAtPos1);
    }

    // Insertion Sort Algorithm  
    public void insertionSort() {
        int iCount;
        int iPosition;
        Comparable keyElement;
        for (iCount = 1; iCount < size(); iCount++) {
            keyElement = (Comparable) get(iCount);
            //position of the key element
            iPosition = iCount;

            while (iPosition > 0 && ((Comparable) get(iPosition - 1)).compareTo(keyElement) > 0) {
                ElementType elemPosMinusOne = get(iPosition - 1);
                set(iPosition, elemPosMinusOne);
                iPosition = iPosition - 1;
            }
            //insert the key element in the correct position
            set(iPosition, (ElementType) keyElement);
        }
    }
}
