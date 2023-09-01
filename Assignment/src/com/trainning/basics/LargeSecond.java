package com.trainning.basics;

public class LargeSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 25, 15, 30};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        System.out.println("Second largest number is: " + secondMax);
	}

}
