/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author Ruben
 */
public class Subject {
    private String moduleName;
    private double grade;
            
    // constructors

    public Subject(String moduleName, double grade) {
        this.moduleName = moduleName;
        this.grade = grade;
    }
    
    // getters and setters

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    // to string

    @Override
    public String toString() {
        return "Subject{" + "moduleName=" + moduleName + ", grade=" + grade + '}';
    }
    
            
       
}


