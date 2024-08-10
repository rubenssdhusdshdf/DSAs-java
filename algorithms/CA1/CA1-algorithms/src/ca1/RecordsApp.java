package ca1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.naming.InvalidNameException;

public class RecordsApp {
    private List<Records> records = new ArrayList<>();
    private int nextId = 10001;

    // Method to add a new record
    public void addRecord(String name, String surName, String position, int age, int phoneNumber) throws InvalidNameException {
        validateName(name); //validate method
        Records newRecord = new Records(nextId++, name, surName, position, age, phoneNumber); //id increases everytieme a record is added
        records.add(newRecord); 
    }

    // Method to validate the name
    private void validateName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty() || name.matches("\\d+")) { //trim method avoid to have "  " as value recorded. Name cannot be empty or contain only digits
            throw new InvalidNameException("Person's name cannot be empty. It cannot have only digits! Please correct this!"); // I neeeded to import javax.naming, ide recommended it to me
        }
    }

    // Method to display all records using a classic for loop
    public void displayRecords() {
        for (int i = 0; i < records.size(); i++) {
            Records record = records.get(i);
            System.out.println(record);
        }
    }

    public static void main(String[] args) {
        RecordsApp app = new RecordsApp();
        Scanner scanner = new Scanner(System.in);
        boolean continueAdding = true;

        while (continueAdding) {
            try {
                System.out.println("Enter first name:");
                String firstName = scanner.nextLine();
                
                // Validate name immediately after reading
                app.validateName(firstName);

                System.out.println("Enter last name:");
                String lastName = scanner.nextLine();

                System.out.println("Enter position:");
                String position = scanner.nextLine();

                System.out.println("Enter age:");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter phone number:");
                int phoneNumber = Integer.parseInt(scanner.nextLine());

                app.addRecord(firstName, lastName, position, age, phoneNumber);

            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) { // I added this lines to avoid that the program crashed when a user enter a string in the age or phone inputs
                System.out.println("Invalid input for age or phone number. Please enter valid numbers.");
            }

            System.out.println("Do you want to add another record? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase(); // as we want the answer is "yes", YES or YeS will be translated as yes
            // because of the lowercase method and trim will be remove blank spaces

            if (!response.equals("yes")) { //if the user write no or other word different to yes, the program stops
                continueAdding = false;
            }
        }

        System.out.println("We have recorded the following information:"); // when the program stops it shows the info added
        app.displayRecords();
        scanner.close();
    }
}
