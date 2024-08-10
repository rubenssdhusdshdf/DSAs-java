package com.mycompany.linearsearchexample;
import java.lang.annotation.ElementType;

public class MyArrayList<ElementType> extends ArrayList<ElementType> {
    // https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html

    public int unordered_sequentialSearch(ElementType key) {
        int iCount;
        for (iCount = 0; iCount < size (); iCount++) {
            System.out.println(key + " was compared to " + get(iCount));
            if (((Comparable) get(iCount)).compareTo((Comparable) key) == 0) {
                return iCount;
            }
        }
        return -1;
    }

    public int ordered_sequentialSearch(ElementType key) {
        int iCount;
        iCount = 0;
        while (((Comparable) get(iCount)).compareTo((Comparable) key) < 0 && iCount < size() - 1) {
            System.out.println(key + " was compared to " + get(iCount));
            iCount++;
        }

        System.out.println(key + " was compared to " + get(iCount));
        if (((Comparable) get(iCount)).compareTo((Comparable) key) == 0) {
            return iCount;
        } else {
            return -1;
        }
    }
}

