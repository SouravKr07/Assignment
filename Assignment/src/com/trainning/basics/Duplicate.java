package com.trainning.basics;
import java.util.HashMap;
import java.util.Map;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = { 1, 2, 3, 2, 4, 3, 5 };
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int duplicateCount = 0;
        for (int count : countMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        
        System.out.println("Number of duplicates: " + duplicateCount);
	}

}
