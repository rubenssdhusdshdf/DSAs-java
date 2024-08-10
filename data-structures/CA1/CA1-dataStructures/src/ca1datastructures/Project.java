/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1datastructures;

/**
 *
 * @author Ruben
 */


import java.util.Objects;

// Project class representing a project record
public class Project {
    private String name; // Project name
    private double budget; // Project budget

    // Constructor to initialize the project with name and budget
    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    // Getter for project name
    public String getName() {
        return name;
    }

    // Getter for project budget
    public double getBudget() {
        return budget;
    }

    // Override toString method for a readable representation of the project
    @Override
    public String toString() {
        return "Project{name='" + name + "', budget=" + budget + "}";
    }

    // Override equals method to compare projects based on name and budget
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same instance
        if (obj == null || getClass() != obj.getClass()) return false; // Check class and null
        Project project = (Project) obj; // Cast object to Project
        return Double.compare(project.budget, budget) == 0 && name.equals(project.name); // Compare fields
    }

    // Override hashCode method to ensure consistency with equals method
    @Override
    public int hashCode() {
        return Objects.hash(name, budget); // Generate hash code based on name and budget
    }
}
