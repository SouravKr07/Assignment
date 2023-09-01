package com.trainning.scan;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MaxLetter {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine().toLowerCase(); 
	        
	        Map<Character, Integer> letterCountMap = new HashMap<>();
	        
	        
	        for (int i = 0; i < word.length(); i++) {
	            char letter = word.charAt(i);
	            letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
	        }
	        
	        char maxLetter = ' ';
	        int maxCount = 0;
	        
	        
	        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxLetter = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }
	        
	        System.out.println("The letter with the maximum occurrence is '" + maxLetter + "' with a count of " + maxCount);
	        
	        scanner.close();
}}
