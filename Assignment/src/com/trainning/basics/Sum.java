package com.trainning.basics;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 25, 15, 30};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum of all digits is: " + sum);
        System.out.println("Average of all digits is: " + average);
	}

}
