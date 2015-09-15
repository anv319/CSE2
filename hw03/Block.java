// Anthony Varshavskiy
// CSE-002
// HW #03
// Block Program
// This program calculates the volume and surface area of a block
// after user inputs its length, width, and height.

// import Scanner class for use in program
import java.util.Scanner;

    // define a class
    public class Block{
        
        // define a main method
        public static void main(String[] args) {
            
            // declare and construct Scanner
            Scanner myScanner = new Scanner( System.in );
            
            // prompt the user for the length of the block
            System.out.print("Enter the length of the block: ");
            
            // user inputs length and Scanner accepts it
            double length = myScanner.nextDouble();
            
            // prompt the user for the width of the block
            System.out.print("Enter the width of the block: ");
            
            // user inputs width and Scanner accepts it
            double width = myScanner.nextDouble();
            
            // prompt the user for the height of the block
            System.out.print("Enter the height of the block: ");
            
            // user inputs height and Scanner accepts it
            double height = myScanner.nextDouble();
            
            // assign variables for volume and surface through formulas
            double volume = length*width*height;
            double surfaceArea = (2*length*width)+(2*length*height)+(2*width*height);
            
            // print out results
            System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume+".");
            System.out.println("The surface area of the block is "+surfaceArea+".");
        }
    }
            
             
    