/*
Anthony Varshavskiy
CSE-002
HW #12
11/17/2015
This program implements matrix transposition on random matrices.
*/

import java.util.Scanner;

public class Transpose {
    
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a width for the matrix: ");
        int width = input.nextInt();
        System.out.print("Enter a height for the matrix: ");
        int height = input.nextInt();
        int[][] array1=randomMatrix(width,height);
        printMatrix(array1);
        System.out.println();
        int[][] array2=transposeMatrix(height,width,array1);
        printMatrix(array2);
    }
    
    public static int[][] randomMatrix(int width, int height) {
        int[][] array1 = new int[height][width];
        for (int i=0; i<array1.length; i++) {
            for (int j=0; j<array1[i].length; j++) {
                array1[i][j] = (int)(Math.random()*21)-10;
            }
        }
        return array1;
    }
    
    public static void printMatrix(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] transposeMatrix(int height,int width,int[][] array1) {
        int[][] array2=new int[width][height];
        for (int i=0; i<array1.length; i++) {
            for (int j=0;j<array1[i].length;j++) {
                array2[j][i]=array1[i][j];
            }
        }
        return array2;
    }
}

