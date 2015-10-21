/*
Anthony Varshavskiy
CSE-002
HW #08
This program calculates the area of three different shapes: circle, rectangle,
and triangle. The user inputs dimensions in the form of a double.
*/

// import Scanner method
import java.util.Scanner;

// define a class
public class Area {
    
// define rectArea method
    public static double rectArea(double width, double height) {
        return width*height;
    }

// define triArea method
    public static double triArea(double base, double height) {
        return (base*height)/2;
    }

// define circArea method
    public static double circArea(double radius) {
        return radius*radius*3.14;
    }

// define valInput method
    public static double valInput() {
        Scanner input = new Scanner(System.in);
        boolean inputNeeded = true;
        double value = 0;
        while (inputNeeded) {
            System.out.print("Your input is acceptable.");
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                inputNeeded = false;
            }
            else {
                System.out.println("Your input is not acceptable. It must be a double.");
            }
            String repeat = input.nextLine();
        }
        return value;
    }
    
// define a main method
    public static void main(String [] args) {
        
// declare and construct Scanner instance
        Scanner myScanner = new Scanner(System.in);
        
// validating user input of shapes
        String r = "rectangle";
        String t = "triangle";
        String c = "circle";
        
        System.out.print("Enter a shape: ");
        String shape = myScanner.next();
        
        while (!(shape.equals(r)) && !(shape.equals(t)) && !(shape.equals(c))) {
            System.out.println("This is not an acceptable shape.");
            System.out.println("Choose either rectangle, triangle, or circle.");
            System.out.print("Enter a shape: ");
            shape = myScanner.next();
        }
        
        if (shape.equals(r)) {
            System.out.print("Enter the width: ");
            double width = myScanner.nextDouble();
            System.out.print("Enter the height: ");
            double height = myScanner.nextDouble();
            double area = rectArea(width, height);
            System.out.println("The area of your rectangle is "+area);
        }
        
        if (shape.equals(t)) {
            System.out.print("Enter the base: ");
            double base = myScanner.nextDouble();
            System.out.print("Enter the height: ");
            double height = myScanner.nextDouble();
            double area = triArea(base, height);
            System.out.println("The area of your triangle is "+area);
        }
        
        if (shape.equals(c)) {
            System.out.print("Enter the radius: ");
            double radius = myScanner.nextDouble();
            double area = circArea(radius);
            System.out.println("The area of your circle is "+area);
        }
    }
}