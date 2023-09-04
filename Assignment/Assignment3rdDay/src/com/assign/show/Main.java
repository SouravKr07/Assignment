package com.assign.show;

public class Main {
	public static void showCourses(String course) {
        try {
            if (!course.equals("java")) {
                throw new Exception("Invalid course");
            }
            System.out.println("Work done");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
}public static void main(String[] args) {
	
	try {
		showCourses("java");
    } catch (Exception e) {
        System.err.println("Exception in main: " + e.getMessage());
    }

}
}