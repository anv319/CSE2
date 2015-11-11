/*
Anthony Varshavskiy
CSE-002
HW #11
11/10/15
This program prompts the user for fifteen integers, stores them
in an array, sorts and scrambles the array, and searches for
an integer within the array upon the user's request.
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    
// scramble method
public static int[] Scramble(int[] array) {
// declaring the Random instance
		Random random = new Random(); 			
		for (int i=0; i<array.length; i++) {
		    int position = random.nextInt(array.length);
		    int place = array[i];
		    array[i] = array[position];
		    array[position] = place;
		}
		return array;
	}
// main method
    public static void main(String[] args) {
// declaring the Scanner instance
        Scanner input = new Scanner (System.in);

// setting variables
        int d, linear;
        int a = 0;
        int[] studentGrades = new int[15];
// Prompt the user for 15 integers to store in an array
        for (int b = 0; b < studentGrades.length; b++) {
            a = -1; 
            while(a < 0) {
                System.out.print("Enter 15 ints (one by one) for final grades in CSE2: ");
                studentGrades[b] = input.nextInt();
                if (studentGrades[b] < 0 || studentGrades[b] > 100) {
                    System.out.println("The grade must between 0 and 100. Try again.");
                    a = -1;
                }
                else {
                    break;  
                }
            }
        }
// Sort the array in ascending order
        Arrays.sort(studentGrades);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print(studentGrades[i]+" ");
        }
        System.out.println();
// Prompt the user for a grade that they would like to search
        System.out.print("Enter a grade to search for: ");
        linear = input.nextInt();
        for (d = 0; d < 15; d++) {
            if (studentGrades[d] == linear) {
                System.out.println(linear + " was found in the list with " + (d + 1) + " iterations.");
                break;
            }
        }
            if (d == 15) {
            System.out.println(linear + " was not found in the list with "+ (d + 1) + " iterations.");
        }
// Scramble the array randomly
        System.out.print("Scrambled: ");
        int[] result = Scramble(studentGrades);
        for (int e = 0; e < studentGrades.length; e++) {
            System.out.print(result[e]+" ");
        }
        System.out.println();
// Prompt the user for a grade they would like to search
        System.out.print("Enter a grade to search for: ");
        int f;
        int scramble = input.nextInt();
        for (f = 0; f < 15; f++) {
            if (studentGrades[f] == scramble) {
                System.out.println(scramble + " was found in the list with " + (f + 1) + " iterations.");
                break;
            }
        }
            if (f == 15) {
            System.out.println(scramble + " was not found in the list with 15 iterations.");
        }
    }
}