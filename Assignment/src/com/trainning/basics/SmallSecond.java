package com.trainning.basics;

public class SmallSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 25, 15, 30};
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        System.out.println("Second smallest number is: " + secondMin);
	}

}
