package com.trainning.basics;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 12345; 
        
        int reversed = reverseNum(num);
        
        System.out.println("Original num: " + num);
        System.out.println("Reversed num: " + reversed);
    }
    
    public static int reverseNum(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return reversed;
	}

}
