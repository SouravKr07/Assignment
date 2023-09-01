package com.trainning.basics;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int[] arr = {10, 5, 25, 15, 30};
	        int max = arr[0];

	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("The greatest number is: " + max);
	    }
	}

