/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1;

/**
 *
 * @author Ruben
 */
public class Manager extends Employee {
    // Declare variables
    private String deptName;
    
    // Constructors
    public Manager(String deptName, String name, int age, double mSal) {
        super(name, age, mSal); // pay attention to super, what it does is reference from the main class
        this.deptName = deptName;
    }
    
    // Getters and setters
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    // toString
    @Override
    public String toString() {
        return "Manager{" + "deptName=" + deptName + ", " + super.toString() + '}';
    }
}
