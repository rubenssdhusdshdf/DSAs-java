package small;
import java.util.*;

    public static void Main(String[] args) {
        ArrayList<Integer> myArrayList;
        Integer iResult;
        int iNumberOfElements = 1000000; // number of elements in the ArrayList

        Main app = new Main();
        myArrayList = new ArrayList<Integer>();

        for (int iCount = 0; iCount < iNumberOfElements; iCount++) {
            Integer iOneNumber = (int) (Math.random() * 30000000);
            myArrayList.add(iOneNumber);
        }
        //To be used to print the items of the array when you have a small array size 
        // System.out.println(list.toString());   

        long lStartTime = System.currentTimeMillis();

        iResult = app.findSmallestElement(myArrayList);

        long lEndTime = System.currentTimeMillis();

        System.out.println("The smallest number in the array is: " + iResult.intValue());

        //*--------------------------------------------
        // calculate the elapsed time and print a message
        //*--------------------------------------------
        System.out.println("Finding the smallest number from an array with " + myArrayList.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
    }

    public Integer findSmallestElement(ArrayList<Integer> iInNumber) {
        Integer iSmallestElement;
        iSmallestElement = iInNumber.get(0);
        for (int iCount = 0; iCount < iInNumber.size(); iCount++) {
            if (iInNumber.get(iCount) < iSmallestElement) {
                iSmallestElement = iInNumber.get(iCount);
            }
        }
        return iSmallestElement;
    }
}
