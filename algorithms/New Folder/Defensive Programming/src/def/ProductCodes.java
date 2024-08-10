/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package def;

/**
 *
 * @author Hamilton
 */
import java.util.Scanner;

public class ProductCodes {
    //---------------------------------------
    //  Counts the number of product codes that are entered with a zone
    //  of R and district greater than 2000 with the pattern TRV2475A5R
    //---------------------------------------

    public static void main(String[] args) {
        
        // 
        String sCode;
        char cZone;
        int iDistrict, iValid = 0, iBanned = 0;
        
        // Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter product code in format XXX1234X5X (STOP to quit): ");
        sCode = keyboard.nextLine();
        while (!sCode.equalsIgnoreCase("STOP")) {
            try {
                cZone = sCode.charAt(9);
                iDistrict = Integer.parseInt(sCode.substring(3, 7));
                iValid++;
                System.out.println("Valid entry");

                if (cZone == 'R' && iDistrict > 2000) {
                    iBanned++;
                }
            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println("Improper code length: " + sCode);
            } catch (NumberFormatException exception) {
                System.out.println("District is not numeric: " + sCode);
            }

            System.out.print("Enter product code (STOP to quit): ");
            sCode = keyboard.nextLine();
        }
        System.out.println("Number of valid codes entered: " + iValid);
        System.out.println("Number of banned codes entered: " + iBanned);
    }
}
