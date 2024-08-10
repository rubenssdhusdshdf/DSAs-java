package ca1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecordsApp {
    // List to store all records
    private List<Records> records = new ArrayList<>(); // we need to import java.util.ArrayList and java.util.List

    // Initial value for the next unique ID
    private int nextId = 10001; // initial value

    // Method to add a new record
    public void addRecord(String name, String surName, String position, int age, int phoneNumber) {
        // Create a new record with the next unique ID and provided details
        Records newRecord = new Records(nextId++, name, surName, position, age, phoneNumber);
        // Add the new record to the list
        records.add(newRecord);
    }

    // Method to display all records using a classic for loop
    public void displayRecords() {
        // Loop through the list of records using a classic for loop
        for (int i = 0; i < records.size(); i++) {
            // Get the record at the current index
            Records record = records.get(i);
            // Print the record
            System.out.println(record);
        }
    }

    public static void main(String[] args) {

        // Create an instance of RecordsApp
        RecordsApp app = new RecordsApp(); // instance of the RecordsApp
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in); // we need to import java.util.Scanner

        // Variable to control the loop for adding more records
        boolean continueAdding = true;

        // Loop to allow the user to add multiple records
        while (continueAdding) {
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine(); // Read user input for first name

            System.out.println("Enter last name:");
            String lastName = scanner.nextLine(); // Read user input for last name

            System.out.println("Enter position:");
            String position = scanner.nextLine(); // Read user input for position

            System.out.println("Enter age (needs to be a number):");
            int age = Integer.parseInt(scanner.nextLine()); // Convert user input to int for age

            System.out.println("Enter phone number (needs to be a number):");
            int phoneNumber = Integer.parseInt(scanner.nextLine()); // Convert user input to int for phone number

            // Add the new record with the provided details
            app.addRecord(firstName, lastName, position, age, phoneNumber); // Call the add method

            // Ask if the user wants to add another record
            System.out.println("Do you want to add another record? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();
            // Trim method to remove any leading or trailing spaces
            // toLowerCase method to convert response to lowercase for comparison

            // Check if the response is not "yes"
            if (!response.equals("yes")) {
                continueAdding = false; // Exit the loop if the response is not "yes"
            }
        }

        // Once the user finishes the loop, display all recorded information
        System.out.println("We have recorded the following information:");
        app.displayRecords(); // Print all records

        // Close the scanner to release system resources
        scanner.close();
    }
}
