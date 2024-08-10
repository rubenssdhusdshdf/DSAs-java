/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1;

/**
 *
 * @author Ruben
 */
public class EmployeApp {
    public static void main(String[] args) {
        Employee enda = new Employee("Enda", 31, 2000.00);
        System.out.println("...employee Enda: " + enda.toString());
        
        Manager emily = new Manager("The Boss", "Emily", 30, 5000);
        System.out.println("...manager Emily: " + emily.toString());
    }
}
