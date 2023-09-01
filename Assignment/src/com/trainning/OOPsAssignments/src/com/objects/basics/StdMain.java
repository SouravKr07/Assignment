package com.objects.basics;
import java.util.Scanner;
public class StdMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter student name: ");
    String name1 = scanner.nextLine();
    System.out.print("Enter student department: ");
    String department1 = scanner.nextLine();
    System.out.print("Enter number of marks: ");
    int numMarks = scanner.nextInt();
    int[] marks1 = new int[numMarks];
    System.out.println("Enter marks:");
    for (int i = 0; i < numMarks; i++) {
        marks1[i] = scanner.nextInt();
    }
    scanner.nextLine(); // Consume newline

    
    System.out.print("Enter student name: ");
    String name2 = scanner.nextLine();
    System.out.print("Enter student department: ");
    String department2 = scanner.nextLine();
    System.out.print("Enter number of marks: ");
    numMarks = scanner.nextInt();
    int[] marks2 = new int[numMarks];
    System.out.println("Enter marks:");
    for (int i = 0; i < numMarks; i++) {
        marks2[i] = scanner.nextInt();
    }

    
    StudentDetails student1 = new StudentDetails(name1, department1);
    StudentDetails student2 = new StudentDetails(name2, department2);

    
    System.out.println("\nStudent 1 Details:");
    student1.printDetails();
    String grade1 = student1.getGrades(marks1);
    System.out.println("Grade: " + grade1);

    System.out.println("\nStudent 2 Details:");
    student2.printDetails();
    String grade2 = student2.getGrades(marks2);
    System.out.println("Grade: " + grade2);

    scanner.close();
}
}
