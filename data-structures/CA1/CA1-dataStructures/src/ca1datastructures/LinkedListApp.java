/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1datastructures;

/**
 *
 * @author Ruben
 */



public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<Project> projectList = new LinkedList<>();

        // Creating and adding projects
        Project project1 = new Project("Project 1", 1000.0);
        Project project2 = new Project("Project 2", 2000.0);
        Project project3 = new Project("Project 3", 3000.0);
        Project project4 = new Project("Project 4", 4000.0);
        Project project5 = new Project("Project 5", 5000.0);

        projectList.add(project1);
        projectList.add(project2);
        projectList.add(project3);
        projectList.add(1, project4); // insert project 4 and index 1
        projectList.add(0, project5); // insert project 5 at index 0

        // Displaying results
        System.out.println("######## Created Project List #########");
        System.out.println("Is project list empty? " + projectList.isEmpty());
        System.out.println("Project list size: " + projectList.size());
        System.out.println("Project list: " + projectList.toString());

        System.out.println("##### Get project at index 2 #####");
        System.out.println("Project at index 2: " + projectList.getProject(2));

        System.out.println("##### Remove project by index #####");
        System.out.println("Remove project at index 0: " + projectList.remove(0));
        System.out.println("Project list size: " + projectList.size());
        System.out.println("Project list: " + projectList.toString());

        System.out.println("##### Identification of the first and last nodes #####");
        System.out.println("First project: " + projectList.getFirst().element);
        System.out.println("Last project: " + projectList.getLast().element);
    }
}
