package com.mycompany.sort.algorithm;

public class SelectionSortExample {
    public static void main(String[] args) {
        // create at least 5 persons
        Person person1 = new Person();
        person1.setsName("John");
        person1.setiAge(45);

        Person person2 = new Person("Heber", 72);
        Person person3 = new Person("Hamilton", 23);
        Person person4 = new Person("Mary", 12);
        Person person5 = new Person("Christmas", 37);

        Person[] personsList = {
            // add the persons created above to the list
            person1, person2, person3, person4, person5
        };

        System.out.println("List before sorting...");
        // print the list elements before sorting
        for (Person person : personsList) {
            System.out.println("Name is " + person.getsName() + " and age is " + person.getiAge());
        }

        System.out.println("*****************");

        // call the function to sort by name
        selectionSortByName(personsList);

        System.out.println("List after sorting by name...");
        // print the list elements after sorting by name
        for (Person person : personsList) {
            System.out.println("Name is " + person.getsName() + " and age is " + person.getiAge());
        }

        System.out.println("*****************");

        // call the function to sort by age
        selectionSortByAge(personsList);

        System.out.println("List after sorting by age...");
        // print the list elements after sorting by age
        for (Person person : personsList) {
            System.out.println("Name is " + person.getsName() + " and age is " + person.getiAge());
        }

        System.out.println("*****************");
    }

    public static void selectionSortByName(Person[] personsList) {
        System.out.println("Called the function selectionSortByName");

        for (int i = 0; i < personsList.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < personsList.length; j++) {
                if (personsList[j].getsName().compareTo(personsList[minIndex].getsName()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Person temp = personsList[minIndex];
                personsList[minIndex] = personsList[i];
                personsList[i] = temp;
            }
        }
    }

    public static void selectionSortByAge(Person[] personsList) {
        System.out.println("Called the function selectionSortByAge");

        for (int i = 0; i < personsList.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < personsList.length; j++) {
                if (personsList[j].getiAge() < personsList[minIndex].getiAge()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Person temp = personsList[minIndex];
                personsList[minIndex] = personsList[i];
                personsList[i] = temp;
            }
        }
    }
}
