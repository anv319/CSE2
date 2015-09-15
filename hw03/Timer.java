// Anthony Varshavskiy
// CSE-002
// HW #03
// Timer Program
// This program calculates the time remaining before user's dinner time
// based on the user's current time using prompts.

// import Scanner class for use in program
import java.util.Scanner;

    // define a class
    public class Timer{
        
        // define a main method
        public static void main(String[] args) {
            
            // declare and construct Scanner
            Scanner myScanner = new Scanner( System.in );
            
            // prompt the user for the current time
            System.out.print("Enter the current time: ");
            
            // user inputs military time in HHMM format and Scanner accepts it
            int checkTime = myScanner.nextInt();
            
            // assign variables for the HH and the MM parts of the current time
            int hours=checkTime/100;
            int minutes=checkTime%100;
            
            // prompt the user for the dinner time
            System.out.print("Enter the time that you will be eating dinner: ");
            
            // user inputs military time in HHMM format and Scanner accepts it
            int dinnerTime = myScanner.nextInt();
            
            // assign variables for the HH and MM parts of the dinner time
            int dinHours=dinnerTime/100;
            int dinMin=dinnerTime%100;
            
            // compute differences of HH and MM to find remaining time until dinner
            int hoursLeft=dinHours-hours;
            int minLeft=dinMin-minutes;
            
            // print remaining time until dinner
            System.out.println("You have "+hoursLeft+" hours and "+minLeft+" minutes left until dinner.");
        }
    }