package com.trainning.basics;

public class PatternSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows = 4; // Number of rows in the pattern
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
	}

}}
