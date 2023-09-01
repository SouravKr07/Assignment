package com.trainning.scan;
import java.util.Scanner;
public class LoginUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] registeredUsernames = {"user1", "user2", "user3"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username to login: ");
        String usernameToLogin = scanner.nextLine();
        
        boolean isValidUsername = false;
        
        
        for (String username : registeredUsernames) {
            if (username.equals(usernameToLogin)) {
                isValidUsername = true;
                break;
            }
        }
        
        if (isValidUsername) {
            System.out.println("You are logged in successfully.");
        } else {
            System.out.println("Invalid username.");
        }
        
        scanner.close();
	}

}
