package com.assign.KeyVal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CityMapExample {
	public static void main(String[] args) {
        
        Map<String, List<String>> cityMap = new HashMap<>();

        
        addCity(cityMap, "Key1", "New York");
        addCity(cityMap, "Key1", "Los Angeles");
        addCity(cityMap, "Key2", "Chicago");
        addCity(cityMap, "Key2", "Houston");
        addCity(cityMap, "Key2", "China"); // Adding the same city again for "Key2"

        
        printCitiesForKey(cityMap, "Key1");
        printCitiesForKey(cityMap, "Key2");
        printCitiesForKey(cityMap, "NonExistentKey"); // This will print an empty list

        
        System.out.println("\nAll key-value pairs in the map:");
        for (Map.Entry<String, List<String>> entry : cityMap.entrySet()) {
            String key = entry.getKey();
            List<String> cities = entry.getValue();
            System.out.println(key + ": " + cities);
        }
}
	
    private static void addCity(Map<String, List<String>> cityMap, String key, String city) {
        cityMap.computeIfAbsent(key, k -> new ArrayList<>()).add(city);
    }

    
    private static void printCitiesForKey(Map<String, List<String>> cityMap, String key) {
        List<String> cities = cityMap.getOrDefault(key, new ArrayList<>());
        System.out.println("Cities for key '" + key + "': " + cities);
	
}}