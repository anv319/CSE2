/*
Anthony Varshavskiy
CSE-002
HW #08
This program analyzes a string by examining all the characters,
or just a specified number of characters in the string, and
determining if they are letters.
*/

// import Scanner method
import java.util.Scanner;

// define a class
public class StringAnalysis {

// define analyzeString method
    public static String analyzeString(String value) {
            for (int i = 0; i < value.length(); i++) {
	        char a = value.charAt(i);
	        if (Character.isLetter(a)) {
		    System.out.println(a + " = LETTER");
	        } 
	        else {
		    System.out.println(a);
	        }
	    }
	    return value;
    }

// define analyzeString method in case of number preference
    public static String analyzeString(String value, int num) {
            for (int i = 0; i < num; i++) {
	        char a = value.charAt(i);
	        if (Character.isLetter(a)) {
		    System.out.println(a + " = LETTER");
	        } 
	        else {
		    System.out.println(a);
	        }
	    }
	    return value;
    }
// define a main method
    public static void main(String[] args) {

// declare and construct Scanner instance
        Scanner input = new Scanner(System.in);
    
// user inputs and program analyzes
        int num;
        String value;
        System.out.print("Enter a string (any word): ");
        value = input.next();
        System.out.print("How many characters would you like to analyze? ");
        num = input.nextInt();
        if (value.length() == num) {
        System.out.println(analyzeString(value));
        }
        else if (value.length() < num) {
        int dif = num - value.length();
        num = num - dif;
        System.out.println(analyzeString(value, num));
        }
        else {
        System.out.println(analyzeString(value, num));    
        }
    }
}


