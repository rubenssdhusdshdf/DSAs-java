
package com.mycompany.binarysearchexample;

import java.util.*;

/**
 *
 * @author Ruben
 * @param <ElementType>
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {
    //https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html

    int binarySearch_nonRecursive(ElementType key, int iInStart, int iInEnd) {
        boolean bFound = false;
        int iMiddle = 0;
        while ((iInStart <= iInEnd) && (bFound == false)) {
            iMiddle = (iInStart + iInEnd) / 2;
            if (((Comparable) get(iMiddle)).compareTo((Comparable) key) == 0) {
                bFound = true;
            } else if (((Comparable) get(iMiddle)).compareTo((Comparable) key) < 0) {
                iInStart = iMiddle + 1;
            } else {
                iInEnd = iMiddle - 1;
            }
        }
        if (bFound == true) {
            return iMiddle;
        } else {
            return -1;
        }
    }

    int binarySearch_recursive(ElementType key, int iInStart, int iInEnd) {
        int iMiddle = (iInStart + iInEnd) / 2;
        int iResult;

        if (((Comparable) get(iMiddle)).compareTo((Comparable) key) == 0) {
            iResult = iMiddle;
        } else if (iInStart == iInEnd) {
            iResult = -1;
        } else {
            if (((Comparable) get(iMiddle)).compareTo((Comparable) key) > 0) {
                iResult = binarySearch_recursive(key, iInStart, iMiddle - 1);
            } else {
                iResult = binarySearch_recursive(key, iMiddle + 1, iInEnd);
            }
        }
        return iResult;
    }
}
