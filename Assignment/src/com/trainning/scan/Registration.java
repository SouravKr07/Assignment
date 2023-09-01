package com.trainning.scan;
import java.util.Scanner;

public class Registration {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] usernames = new String[]{"user1", "user2", "user3"};
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter name to register: ");
	        String newUsername = scanner.nextLine();
	        
	        boolean isUnique = true;
	        	        
	        for (String username : usernames) {
	            if (username.equals(newUsername)) {
	                isUnique = false;
	                break;
	            }
	        }
	        
	        if (isUnique) {
	            System.out.println("You are registered.");
	        } else {
	            System.out.println("Name is not unique.");
	        }
	        
	        scanner.close();
	}

}
