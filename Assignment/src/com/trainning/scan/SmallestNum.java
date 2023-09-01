package com.trainning.scan;
import java.util.Scanner;
public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first num");

		int num1 = scanner.nextInt();
		System.out.println("Enter the second num");

		int num2 = scanner.nextInt();
		System.out.println("Enter the third num");

		int num3 = scanner.nextInt();

		int smallest = (num1<num2 &&num1<num3)? num1:((num2<num3)?num2:num3);
		System.out.println("Smallest num is"+ smallest);
		scanner.close();
	}

}
