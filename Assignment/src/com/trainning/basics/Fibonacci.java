package com.trainning.basics;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10; 
	        
	        System.out.println("Fibonacci series:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }
	    
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        
	        int prev = 0;
	        int current = 1;
	        
	        for (int i = 2; i <= n; i++) {
	            int next = prev + current;
	            prev = current;
	            current = next;
	        }
	        
	        return current;
	}

}
