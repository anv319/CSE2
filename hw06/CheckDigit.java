/* 
Anthony Varshavskiy
CSE-002
HW #06
This program is essentially an ISBN validator. It checks whether
the user's input of 10 digits is a valid ISBN number.
*/

// import Scanner method
import java.util.Scanner;

// define a class
public class CheckDigit {
    
// define a main method
    public static void main(String[] args) {

// declare and construct Scanner instance
        Scanner myScanner = new Scanner( System.in );
        
// a loop that checks if the input is a ten digit number
        int tenDigit;
        do {
        System.out.print("Please enter a 10 digit barcode: ");
        while (!myScanner.hasNextInt()) {
            System.out.print("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
            myScanner.next();
        }
        tenDigit = myScanner.nextInt();
        break;
    } while (tenDigit > 0);
        if (tenDigit < 0) {
             System.out.print("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
             myScanner.next();
        }
        if (tenDigit.length()!=10) {
            System.out.print("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
        }
        
    }
}