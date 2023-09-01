package com.trainning.basics;
import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 2, 8, 1, 3 };

		Arrays.sort(array);

		System.out.println("Sorted array in ascending order:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
