package com.trainning.scan;
import java.util.Scanner;

public class ArraySquareRoot {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	 
     
     
     System.out.print("Enter the size of the array: ");
     int size = scanner.nextInt();
     
     
     int[] originalArray = new int[size];
     
     
     for (int i = 0; i < size; i++) {
         System.out.print("Enter element #" + (i + 1) + ": ");
         originalArray[i] = scanner.nextInt();
     }
     
     
     double[] squareRootArray = new double[size];
     
     
     for (int i = 0; i < size; i++) {
         squareRootArray[i] = Math.sqrt(originalArray[i]);
     }
     
     
     System.out.println("Square root values:");
     for (int i = 0; i < size; i++) {
         System.out.println("Element #" + (i + 1) + ": " + squareRootArray[i]);
     }
     
     scanner.close();
	}
}
