package com.trainning.scan;
import java.util.Scanner;
public class SumAvg {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
       
        int[] array = new int[size];
        
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        
        
        double average = (double) sum / size;
        
        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        
        scanner.close();
}
	}
