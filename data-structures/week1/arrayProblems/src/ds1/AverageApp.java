/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1;
import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author Ruben
 */
public class AverageApp {
    public static void main(String[] args) {
        int[] nums = new int[5];
        double sum = 0, avg;


        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number " + (i + 1)));
            sum += nums[i]; // Simplified addition
        }


        avg = sum / nums.length;
        JOptionPane.showMessageDialog(null, "The numbers: " + Arrays.toString(nums) +
                "\nThe average is: " + avg);
    }
}

