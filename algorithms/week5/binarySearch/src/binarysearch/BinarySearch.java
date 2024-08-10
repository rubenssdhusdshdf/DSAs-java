package binarysearch;

public class BinarySearch {

    public int binarySearchRecursive(People[] people, long key, int iInStart, int iInEnd) {
        if (iInStart > iInEnd) {
            return -1; // Not found
        }

        int iMiddle = (iInStart + iInEnd) / 2;

        // Compare the key with the credit field of the middle element
        if (people[iMiddle].getCredit() == key) {
            return iMiddle; // Found the element
        } else if (people[iMiddle].getCredit() > key) {
            // Search in the left half
            return binarySearchRecursive(people, key, iInStart, iMiddle - 1);
        } else {
            // Search in the right half
            return binarySearchRecursive(people, key, iMiddle + 1, iInEnd);
        }
    }
}
