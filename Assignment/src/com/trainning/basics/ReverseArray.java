package com.trainning.basics;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5 }; 

		reverseArray(array);

		System.out.println("Reversed array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
	}
	}
}
