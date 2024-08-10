/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben
 */
public class Test2 {
    public static void main(String[] args) {
        
        // 1 Add a String to the list
        List<String> myList = new ArrayList<>();
        myList.add("Leinster");

        // Print the list
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 2 Try to add an Integer to the list, you will get an error, try to understand this error.
        // myList.add(3); // Uncommenting this line will cause a compile-time error because myList is a List<String>

        // 3 Remove the item at index 0
        myList.add("are");
        myList.add("in");
        myList.add("the");
        myList.add("final");
        myList.add("today");
        
        // Print the list
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        myList.remove(0);
        
        System.out.println("After remove......");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 4 Insert an item at index 1
        myList.add(0, "Tolouse");
        myList.add(1, "and");
        myList.add(2, "Leinster");

        // 5 Remove the first occurrence of a String
        myList.remove("and");
        System.out.println("After removing \"and\"......");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 6 Use set(int index, E element)
        myList.set(4, "London");
        System.out.println("After setting index 4 to \"London\"......");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 7 Check if an object is in the list
        System.out.println("Does the list contain \"Munster\"? " + myList.contains("Munster"));
        System.out.println("Does the list contain \"London\"? " + myList.contains("London"));

        // 8 Create a new ArrayList and add it to myList
        List<String> newList = new ArrayList<>();
        newList.add("testing");
        newList.add("1");
        newList.add("2");
        newList.add("3");

        myList.addAll(newList);
        System.out.println("After adding a new list to myList......");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 9 Clear an ArrayList and print it
        System.out.println("Before clearing newList......");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        newList.clear();
        
        System.out.println("After clearing newList......");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        // 10 Create a class to represent an Employee
        class Employee {
            String name;
            int age;
            double monthlySalary;
            double yearlySalary;

            Employee(String name, int age, double monthlySalary) {
                this.name = name;
                this.age = age;
                this.monthlySalary = monthlySalary;
                this.yearlySalary = monthlySalary * 12;
            }

            @Override
            public String toString() {
                return name + ", " + age + ", " + monthlySalary + ", " + yearlySalary;
            }
        }

        // Create an ArrayList to store Employee instances
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 3000));
        employees.add(new Employee("Jane", 25, 3500));
        employees.add(new Employee("Jim", 40, 4000));

        // Print employees
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Remove the element (Employee) from the first position in the ArrayList
        employees.remove(0);
        System.out.println("After removing the first employee:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // 11 Create a new Manager class
        class Manager extends Employee {
            String deptName;

            Manager(String name, int age, double monthlySalary, String deptName) {
                super(name, age, monthlySalary);
                this.deptName = deptName;
            }

            @Override
            public String toString() {
                return super.toString() + ", " + deptName;
            }
        }

        // Insert an object of type Manager into the Employee ArrayList
        employees.add(new Manager("Alice", 35, 5000, "Sales"));
        System.out.println("After adding a manager:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
