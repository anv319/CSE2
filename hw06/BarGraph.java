/*
Anthony Varshavskiy
CSE-002
HW #06
This program prompts you to input your expenses for each day of
the week for one week. With this input, the program will print
out a bar graph that represents the weekly expenses using 
horizontal bars made out of the * character. The program also
calculates your average weekly expenses and an estimated
expenditure for four years.
*/

// import the Scanner method
import java.util.Scanner;

// define a class
public class BarGraph {
    
// define a main method
    public static void main(String[] args) {
        
// declare and construct Scanner instance
        Scanner myScanner = new Scanner( System.in );

// user inputs Monday expense and Scanner accepts it in $X.XX format
        double expMonday;
        do {
        System.out.print("Expenses for Monday:    $");
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
        }
        expMonday = myScanner.nextDouble();
        break;
    } while (expMonday > 0);
        if (expMonday < 0) {
             System.out.print("Please only enter positive numbers. Try again: $");
             myScanner.next();
        }
        
// user inputs Tuesday expense
        double expTuesday;
        do {
        System.out.print("Expenses for Tuesday:   $");
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
        }
        expTuesday = myScanner.nextDouble();
        break;
    } while (expTuesday > 0);
        if (expTuesday < 0) {
             System.out.print("Please only enter positive numbers. Try again: $");
             myScanner.next();
        }
        
// user inputs Wednesday expense
        double expWednesday;
        do {
        System.out.print("Expenses for Wednesday: $");
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
        }
        expWednesday = myScanner.nextDouble();
        break;
    } while (expWednesday > 0);
        if (expWednesday < 0) {
             System.out.print("Please only enter positive numbers. Try again: $");
             myScanner.next();
        }
        
// user inputs Thursday expense
        double expThursday;
        do {
        System.out.print("Expenses for Thursday:  $");
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
        }
        expThursday = myScanner.nextDouble();
        break;
    } while (expThursday > 0);
        if (expThursday < 0) {
             System.out.print("Please only enter positive numbers. Try again: $");
             myScanner.next();
        }
        
// users inputs Friday expense
        double expFriday;
        do {
        System.out.print("Expenses for Friday:    $");
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
        }
        expFriday = myScanner.nextDouble();
        break;
    } while (expFriday > 0);
        if (expFriday < 0) {
             System.out.print("Please only enter positive numbers. Try again: $");
             myScanner.next();
        }
        
// user inputs Saturday expense
        double expSaturday;
        do {
        System.out.print("Expenses for Saturday:  $");
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
        }
        expSaturday = myScanner.nextDouble();
        break;
    } while (expSaturday > 0);
        if (expSaturday < 0) {
             System.out.print("Please only enter positive numbers. Try again: $");
             myScanner.next();
        }
        
// user inputs Sunday expense
        double expSunday;
        do {
        System.out.print("Expenses for Sunday:    $");
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
        }
        expSunday = myScanner.nextDouble();
        break;
    } while (expSunday > 0);
        if (expSunday < 0) {
             System.out.print("Please only enter positive numbers. Try again: $");
             myScanner.next();
        }
        System.out.println();
        
// round the expenses to an integer for bar graph
        int Monday = (int)Math.round(expMonday);
        int Tuesday = (int)Math.round(expTuesday);
        int Wednesday = (int)Math.round(expWednesday);
        int Thursday = (int)Math.round(expThursday);
        int Friday = (int)Math.round(expFriday);
        int Saturday = (int)Math.round(expSaturday);
        int Sunday = (int)Math.round(expSunday);
        
// a loop that generates a bar graph made of * symbols 
        System.out.print("Mon:    ");
        int a = 0;
        for(a=0; a<Monday; a++) {
        System.out.print("*");
        }
        System.out.println();

        System.out.print("Tues:   ");
        for(a=0; a<Tuesday; a++) {
        System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Wed:    ");
        for(a=0; a<Wednesday; a++) {
        System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Thu:    ");
        for(a=0; a<Thursday; a++) {
        System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Fri:    ");
        for(a=0; a<Friday; a++) {
        System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Sat:    ");
        for(a=0; a<Saturday; a++) {
        System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Sun:    ");
        for(a=0; a<Sunday; a++) {
        System.out.print("*");
        }
        System.out.println();
        System.out.println();
        
// calculation of average expenses based on inputs
        double average = (expMonday+expTuesday+expWednesday+expThursday+expFriday+expSaturday+expSunday)/7;
        System.out.printf("Your average daily expenses are: $%.2f.%n", average);
        
// a loop that calculates estimated expenditure for 4 years
        int b = 0;
        double estExp = 0;
        double estPer, perDecrease, perIncrease;
        for (b=0; b<209; b++) {
            estPer = (int)Math.random()*41;
        if (estPer<=20) {
            perDecrease = 1-((estPer)*0.01);
            estExp = estExp + (average*perDecrease);
        }
        if (estPer>20) {
            perIncrease = ((40-estPer)*0.01)+1;
            estExp = estExp + (average*perIncrease);
        }
        }

// converts estimated expenditure to dollar format
        int dollars, dimes, pennies;
        dollars = (int)estExp;
        dimes=(int)(estExp * 10) % 10;
        pennies=(int)(estExp * 100) % 10;
        System.out.println("Estimated expenditure for 4 years: $"+dollars+'.'+dimes+pennies);
    }
}