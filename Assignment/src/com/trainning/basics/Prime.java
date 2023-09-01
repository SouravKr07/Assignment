package com.trainning.basics;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 17;

		boolean isPrime = isPrimeNumber(number);

		if (isPrime) {
			System.out.println(number + " is a prime num");
		} else {
			System.out.println(number + " is not a prime num");
		}
	}

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
