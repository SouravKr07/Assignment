package com.trainning.basics;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 28;

		boolean isPerfect = isPerfectNum(num);
		if (isPerfect) {
			System.out.println(num + " is a perfect num");
		} else {
			System.out.println(num + " is not a perfect num");
		}
	}

	public static boolean isPerfectNum(int num) {
		if (num <= 1) {
			return false;
		}

		int sum = 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				sum += i;
				if (i != num / i) {
					sum += num / i;
				}
			}
		}

		return sum == num;
	}

}
