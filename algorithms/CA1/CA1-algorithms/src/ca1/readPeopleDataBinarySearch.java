package ca1;

import java.io.File;
import java.util.*;

/**
 * Author: Ruben
 */
public class readPeopleDataBinarySearch {
    // Parsing and reading the CSV file data into the object array
    // I am not using the relative path provided because I had some issues running
    // the code with it
    // String name = directory.getAbsolutePath() + "//people.csv";
    public static void main(String[] args) throws Exception {
        // Parsing and reading the CSV file data into the object array
        File directory = new File(
                "C:/Users/Ruben/OneDrive/escritorio/programacion/nci/algorithms/CA1/CA1-algorithms/src/ca1");
        String name = directory.getAbsolutePath() + "/people.csv";

        // List to store People objects - changed it a bit. In here peopleList variable
        // refers to a new list of people
        List<People> peopleList = new ArrayList<>();

        // Use try-with-resources for the Scanner to ensure it is closed properly
        try (Scanner scanner = new Scanner(new File(name))) {
            // this will just print the header in CSV file
            scanner.nextLine();
            String sGetData;

            while (scanner.hasNextLine()) { // Read all records
                sGetData = scanner.nextLine();
                String[] data = sGetData.split(",");
                peopleList.add(new People(Integer.parseInt(data[0]), data[1], data[2], data[3],
                        Integer.parseInt(data[4]), Long.parseLong(data[5])));
            }
        } // closes the scanner

        // Convert the people list (containing People Objects) into a MyArrayList
        MyArrayList<People> sortedPeopleList = new MyArrayList<>(peopleList);

        // Sort by Name
        sortedPeopleList.sort(Comparator.comparing(People::getsName));
        // sortedPeopleList - instance of MyArrayList<People>
        // sort - recommended for binary search algorithms
        // People:getsName = method reference for getting name

        // Get user input for the name to search
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Enter the name to search: "); // user type a name
            String searchName = inputScanner.nextLine();

            // Perform binary search on the sorted list for the input name
            int index = MyArrayList.binarySearchByName(sortedPeopleList, searchName, 0, sortedPeopleList.size() - 1);

            // Output result based on the search
            if (index >= 0) {
                System.out.println("'" + searchName + "' was found in the Name list!");
            } else {
                System.out.println("'" + searchName + "' was not found in the Name list!");
            }

            // Print all entries in the sorted people list
            for (int i = 0; i < sortedPeopleList.size(); i++) {
                System.out.println(sortedPeopleList.get(i));
            }
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
        return Long.compare(this.lCredit, myPeople.lCredit);
    }

    @Override
    public String toString() {
        return "Person [ID= " + iId + ", Name= " + sName + ", Surname= "
                + sSurname + ", Job= " + sJob + ", Age= "
                + iAge + ", Credit= " + lCredit + "]";
    }

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

    // Binary search method to search for a name in a sorted list of People
    public static int binarySearchByName(MyArrayList<People> list, String key, int start, int end) {
        // Calculate the middle index of the current segment
        while (start <= end) { // O(log N)
            int middle = (start + end) / 2; // O(1)

            // Directly access and compare the name at the middle index with the search key
            if (list.get(middle).getsName().equalsIgnoreCase(key)) { // O(1) Base case: found the key
                return middle; // O(1) Return the index where the key was found
            } else if (list.get(middle).getsName().compareToIgnoreCase(key) > 0) { // O(1) Compare and search left half
                end = middle - 1; // O(1)
            } else { // Search right half
                start = middle + 1; // O(1)
            }
        }
        return -1; // Key not found
    }
}
