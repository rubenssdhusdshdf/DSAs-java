
package defensive;

import java.util.Scanner;

public class TryCatch {
    public static void main(String args[]) {
        int iNumerator;
        int iDenominator = 0;
        System.out.println("Enter a new record ");
        
        try {
            Scanner keyboard = new Scanner(System.in);
            iNumerator = keyboard.nextInt();
            
            System.out.println( iNumerator / iDenominator);
            System.out.println( "This text will not be shown");
        }
        catch (ArithmeticException error)
        {
            System.out.println(error.getMessage());
        }
        finally
                {
                    System.out.println("This text will be shown NOW");
                }
    }
}
