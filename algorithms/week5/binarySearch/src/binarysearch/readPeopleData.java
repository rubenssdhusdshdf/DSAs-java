import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class readPeopleData {

    public static void main(String[] args) throws Exception {
        // Specify the path to the CSV file
        String filePath = "C:\\Users\\Ruben\\OneDrive\\Escritorio\\Programacion\\nci\\algorithms\\week5\\binarySearch\\src\\binarysearch\\people.csv";

        // Parsing and reading the CSV file data into the object array
        File file = new File(filePath);
        People[] people;

        try (Scanner scanner = new Scanner(file)) {
            people = new People[10000];
            // Skip the header line
            scanner.nextLine();

            int i = 0;
            while (scanner.hasNextLine()) {
                String sGetData = scanner.nextLine();
                String[] data = sGetData.split(",");
                people[i++] = new People(Integer.parseInt(data[0]), data[1], data[2], data[3], Integer.parseInt(data[4]), Long.parseLong(data[5]));
            }
        }

        // Sorting the array based on the credit field
        Arrays.sort(people, 0, people.length, Comparator.nullsLast(Comparator.naturalOrder()));

        // Output the sorted array
        System.out.println("Sorted People array:");
        for (People person : people) {
            System.out.println(person);
        }

        // Perform binary search
        BinarySearch searcher = new BinarySearch();
        long searchKey = 100000; // Example search key
        int foundIndex = searcher.binarySearchRecursive(people, searchKey, 0, people.length - 1);

        if (foundIndex != -1) {
            System.out.println("\nFound at index: " + foundIndex);
            System.out.println("Person found: " + people[foundIndex]);
        } else {
            System.out.println("\nElement with credit " + searchKey + " not found.");
        }
    }
}

class People implements Comparable<People> {
    private int iId;
    private String sName;
    private String sSurname;
    private String sJob;
    private int iAge;
    private long lCredit;

    // constructor
    public People(int iInId, String sInName, String sInSurname, String sInJob, int iInAge, long lInCredit) {
        this.iId = iInId;
        this.sName = sInName;
        this.sSurname = sInSurname;
        this.sJob = sInJob;
        this.iAge = iInAge;
        this.lCredit = lInCredit;
    }

    // Compare based on credit field
    @Override
    public int compareTo(People other) {
        return Long.compare(this.lCredit, other.lCredit);
    }

    @Override
    public String toString() {
        return "Person [ID= " + iId + ", Name= " + sName + ", Surname= "
                + sSurname + ", Job= " + sJob + ", Age= "
                + iAge + ", Credit= " + lCredit + "]";
    }
}
