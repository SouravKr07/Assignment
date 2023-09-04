package com.assign.show;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee("John", 1, "New York"),
            new Employee("Alice", 2, "Los Angeles"),
            new Employee("Bob", 3, "Chicago"),
            new Employee("Eva", 4, "New York"),
            new Employee("David", 5, "Chicago")
        ));

       
        String targetCity = "Chicago";

        
        List<Employee> employeesInTargetCity = new ArrayList<>();

        
        for (Employee employee : employeeList) {
            if (employee.getCity().equals(targetCity)) {
                employeesInTargetCity.add(employee);
            }
        }

        
        System.out.println("Employees in " + targetCity + ":");
        for (Employee employee : employeesInTargetCity) {
            System.out.println(employee);
        }
    }
}
