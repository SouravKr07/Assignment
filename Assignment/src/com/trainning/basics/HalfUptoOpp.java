package com.trainning.basics;

public class HalfUptoOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5; 
        int numStars = rows; 
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= numStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            numStars--;
	}
	}
}
