//Anthony Varshavskiy
//CSE-002
//09/11/2015
//Check Program
//This program determines how to split a check evenly among the user
//and friends based on how much user is willing to pay.

// import Scanner class to use in program
import java.util.Scanner;
// define a class
    public class Check{
// main method required for every Java program
        public static void main(String[] args) {
// declare and construct Scanner instance
            Scanner myScanner = new Scanner( System.in );
// prompt the user for original cost of check
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
// user inputs cost of original check and Scanner accepts it
            double checkCost = myScanner.nextDouble();
// prompt the user for the % tip that he/she wishes to pay
            System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
// user inputs % tip and Scanner accepts it
            double tipPercent = myScanner.nextDouble();
// convert the percentage into a decimal value
            tipPercent /= 100;
// prompt the user for # of people he/she went out with
            System.out.print("Enter the number of people who went out to dinner: ");
// user inputs # of people and Scanner accepts it
            int numPeople = myScanner.nextInt();
// Compute the output by declaring variables
            double totalCost;
            double costPerPerson;
            int dollars,   //whole dollar amount of cost 
                dimes, pennies; //for storing digits to the right of the decimal point for the cost$ 
            totalCost = checkCost * (1 + tipPercent);
            costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
            dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)(costPerPerson * 10) % 10;
            pennies=(int)(costPerPerson * 100) % 10;
            System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
}  //end of main method   
  	} //end of class
