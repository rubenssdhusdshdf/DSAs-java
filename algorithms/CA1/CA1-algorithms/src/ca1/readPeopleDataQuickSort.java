package ca1;


import java.io.File;
import java.util.*;


/**
 * @author Ruben
 */
public class readPeopleDataQuickSort {
    public static void main(String[] args) throws Exception {
        // Parsing and reading the CSV file data into the object array
        // I am not using the relative path provided because I had some issues running
        // the code with it
        // String name = directory.getAbsolutePath() + "//people.csv";
        File directory = new File(
                "C:/Users/Ruben/OneDrive/escritorio/programacion/nci/algorithms/CA1/CA1-algorithms/src/ca1");
        String name = directory.getAbsolutePath() + "/people.csv";


        // Array to store People objects - changed it a bit. In here people variable
        // refers to an a new array of people containing
        // objects with a length of 10,000
        People[] people = new People[10000];


        try (Scanner scanner = new Scanner(new File(name))) {
            // this will just print the header in CSV file
            scanner.nextLine();
            int i = 0;
            String sGetData;


            while (scanner.hasNextLine() && i < 10000) { // Limit loop to read only x records
                sGetData = scanner.nextLine();
                String[] data = sGetData.split(",");
                people[i++] = new People(Integer.parseInt(data[0]), data[1], data[2], data[3],
                        Integer.parseInt(data[4]), Long.parseLong(data[5]));
            }
            // closes the scanner
        }


        // Convert the people array (containing People Objects) into a MyArrayList
        MyArrayList<People> sortedPeopleList = new MyArrayList<>(Arrays.asList(people));


        // Record start time in milliseconds
        long startTime = System.currentTimeMillis();


        // Call the quickSort() method
        sortedPeopleList.quickSort(0, sortedPeopleList.size() - 1);


        // Record end time
        long endTime = System.currentTimeMillis();


        // Calculate the duration
        long duration = endTime - startTime;


        // Print the time taken
        System.out.println("Time taken for sorting: " + duration + " milliseconds");


        // Print all entries in the sorted people list
        for (People person : sortedPeopleList) {
            System.out.println(person);
        }
    }
}


// People class
class People implements Comparable<People> {
    private int iId;
    private String sName;
    private String sSurname;
    private String sJob;
    private int iAge;
    private long lCredit;


    // People Constructor
    public People(int iInId, String sInName, String sInSurname, String sInJob, int iInAge, long lInCredit) {
        this.iId = iInId;
        this.sName = sInName;
        this.sSurname = sInSurname;
        this.sJob = sInJob;
        this.iAge = iInAge;
        this.lCredit = lInCredit;
    }


    @Override
    public int compareTo(People myPeople) {
        // Compare by lCredit as per requirement
        // This section compares the column of the excel
        // my column is lCredit (6th column)
        return Long.compare(this.lCredit, myPeople.lCredit);
    }


    @Override
    public String toString() {
        return "Person [ID= " + iId + ", Name= " + sName + ", Surname= "
                + sSurname + ", Job= " + sJob + ", Age= "
                + iAge + ", Credit= " + lCredit + "]";
    }


    // Getters and setters
    public int getiId() {
        return iId;
    }


    public void setiId(int iId) {
        this.iId = iId;
    }


    public String getsName() {
        return sName;
    }


    public void setsName(String sName) {
        this.sName = sName;
    }


    public String getsSurname() {
        return sSurname;
    }


    public void setsSurname(String sSurname) {
        this.sSurname = sSurname;
    }


    public String getsJob() {
        return sJob;
    }


    public void setsJob(String sJob) {
        this.sJob = sJob;
    }


    public int getiAge() {
        return iAge;
    }


    public void setiAge(int iAge) {
        this.iAge = iAge;
    }


    public long getlCredit() {
        return lCredit;
    }


    public void setlCredit(long lCredit) {
        this.lCredit = lCredit;
    }
}


// MyArrayList implements QuickSort algorithm
class MyArrayList<ElementType extends Comparable<ElementType>> extends ArrayList<ElementType> {


    // default constructor
    public MyArrayList() {
        super();
    }


    // Constructor that accepts a collection
    public MyArrayList(Collection<? extends ElementType> c) {
        super(c);
    }


    // Method to sort the list using the QuickSort algorithm
    public void quickSort(int iStart, int iEnd) {
        int iPivotIndex; // declare pivot of the index // O(1)
        if (iStart < iEnd) { // as long as the start is less than the end
            // we will select the pivot, rearrange elements in the partition,
            // such as as all elements from the left and all elements to the
            // right // O(1)
            /*
             * select pivot and re-arrange elements in two partitions such as
             * all array[start … p-1] are less than pivot = array [p] and
             * all array[p+1 … end] are >= pivot
             */
            iPivotIndex = partition(iStart, iEnd); // 0(N)


            // sort first partition of the array (from start to pivot_index-1)
            // We call recursively this function quickSort again from the start,
            // what we are doing here is move elements smaller than the pivot to
            // the left
            // and values higher than 1 to the right
            quickSort(iStart, iPivotIndex - 1); // T(n/2)
            quickSort(iPivotIndex + 1, iEnd); // T(n/2)
        } else // do nothing, the array has one element, so it's sorted
        {
            return; // o(1) this return statement is not really neccessary, but it is there for
                    // clarity reasons
        }
    }


    // Second part, where we increment up or increment down until we find the value
    // less or greater
    // than the pivot and then we swap up and down. If they cross each other, we
    // swap them down with the pivot
    // and we repeat all of this
    public int partition(int iStart, int iEnd) {
        int iUp, iDown; // O(1)
        ElementType pivot;


        // we read the element from the start, we pivot as the pivot value
        pivot = get(iStart); // O(1)


        // we swap the labels up and down to be start and end in the
        // beginning


        // set the UP and DOWN indexes
        iUp = iStart; // O(1)
        iDown = iEnd; // O(1)


        // We increment up as long as up is less than down and up is less that end
        // and the value at up is less or equal to the pivot.
        // if true, increment up
        while (iUp < iDown) { // O(n) in total for the loop
            // increment UP index until found first element higher than pivot
            while (iUp < iEnd && get(iUp).compareTo(pivot) <= 0) { // O(1) * O(n) in total
                iUp = iUp + 1; // O(1)
            }


            // decrement DOWN as long as we did not reach the beginning of
            // the array and the value at down is greater than the value of the
            // pivot
            while (iDown > iStart && get(iDown).compareTo(pivot) >= 0) { // O(1) * O(n) in total
                iDown = iDown - 1; // O(1)
            }


            // if UP and DOWN indexes did not cross each other
            if (iUp < iDown) { // O(1)
                ElementType elementUp = get(iUp); // we take the element in iup and store into elementUp
                // O(1)


                // we take the value from up and put it out element up
                // We declare a temporary value to swap the up and down, because if
                // we simply take up and put it at down, then we would not have a value
                // remaining at down. We need to temporary store in var value between before
                // we overwrite it.
                set(iUp, get(iDown)); // element in down stored in iUp - so for a split of second there at up and down
                                      // would have the same value
                // The value from down would be duplicated at up, so that's why we save value
                // from up in line 219, so we get that value and put it that down //O(1)
                set(iDown, elementUp); // element in up stored in iDown //O(1)
                // At up and down, we now have the down and up, up at down
            }
        }


        // all this block is repeated until up is less than down
        // when they did pass each other, or they cross each other, then we swap the
        // pivot with the value up down
        // we read the value at down and put it at the start index where we know we will
        // find the pivot and we get the
        // pivot and put it at the value down
        set(iStart, get(iDown)); // O(1)
        set(iDown, pivot); // O(1)
        return iDown; // O(1)
    }
}


// Time complexity O(n log n), worst O(N2)
