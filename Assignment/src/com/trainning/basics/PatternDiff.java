package com.trainning.basics;

public class PatternDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 4; 
	        int num = 1; 
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	}
	}
}
