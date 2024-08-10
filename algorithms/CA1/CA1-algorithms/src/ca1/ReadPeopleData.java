package ca1;


import java.io.File;
import java.util.*;


/**
 * @author Ruben
 */
public class ReadPeopleData {
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
        People[] people = new People[10];


        try (Scanner scanner = new Scanner(new File(name))) {
            // this will just print the header in CSV file
            scanner.nextLine();
            int i = 0;
            String sGetData;


            while (scanner.hasNextLine() && i < 10) { // && i < n - limit loop to read only x records, change also line
                                                      // 19
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


        // Call the bubbleSort() method
        sortedPeopleList.bubbleSort();


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
        // my column is iCredit (6th column)
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


// MyArrayList --> this implements the bubbleAlgorithm - followed example in
// class
// Array class extends arrayList and adds a bubbleSort method
class MyArrayList<ElementType extends Comparable<ElementType>> extends ArrayList<ElementType> {


    // default constructor
    public MyArrayList() {
        super();
    }


    // Constructor that accepts a collection
    public MyArrayList(Collection<? extends ElementType> c) {
        super(c);
    }


    // Method to sort the list using the bubble sort algorithm
    public void bubbleSort() {
        int iCount, jCount;
        // Outer loop to traverse through all elements
        for (iCount = 0; iCount < size(); iCount++) { // O(N) * 1 = O(N)
            // Inner loop for comparing adjacent elements
            for (jCount = 0; jCount < size() - 1 - iCount; jCount++) { // O(M) * O(1) = O(M)
                // Get the current element and the next element
                ElementType elementAtjCount = get(jCount); // O(1) + O(1) = O(2) = O(1) simplified
                ElementType elementAtjCountPlus = get(jCount + 1); // O(1) + O(1) = O(2) = O(1) simplified


                // Compare the current element with the next element
                // If the current element is greater, swap them
                if (elementAtjCount.compareTo(elementAtjCountPlus) > 0) { // O(1)
                    // Swap element at position jCount with element at position jCount + 1
                    swap(jCount, jCount + 1); // O(1)
                }
            }
        }
    }


    // Method to swap elements at two positions
    public void swap(int inPos1, int inPos2) {
        // Create two objects that will store the info from the two positions
        ElementType objPos1 = get(inPos1); // O(1) + O(1) = O(2) = O(1) simplified
        ElementType objPos2 = get(inPos2); // O(1) + O(1) = O(2) = O(1) simplified


        // Remove element from position 1
        remove(inPos1); // O(N)


        // Insert objPos2 into position 1
        add(inPos1, objPos2); // O(N)


        // Remove element from position 2
        remove(inPos2); // O(N)


        // Insert objPos1 into position 2
        add(inPos2, objPos1); // O(N)
    }
}
