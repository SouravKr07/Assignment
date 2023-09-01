package com.trainning.basics;

public class Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        int[] arr = {10, 5, 25, 15, 30};
		        int min = arr[0];

		        for (int num : arr) {
		            if (num < min) {
		                min = num;
		            }
		        }

		        System.out.println("The smallest number is: " + min);
		    }
	}


