/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1;

/**
 *
 * @author Ruben
 */
public class Employee {
    // Declare variables
    private String name;
    private int age;
    private double mSal, ySal; 
    
    // Constructor
    public Employee(String name, int age, double mSal) {
        this.name = name;
        this.age = age;
        this.mSal = mSal;
        this.ySal = mSal * 12;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getmSal() {
        return mSal;
    }

    public void setmSal(double mSal) {
        this.mSal = mSal;
        this.ySal = mSal * 12; // Update yearly salary when monthly salary changes
    }

    public double getySal() {
        return ySal;
    }

    public void setySal(double ySal) {
        this.ySal = ySal;
    }
    
    // toString
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", mSal=" + mSal + ", ySal=" + ySal + '}';
    }
    

}
