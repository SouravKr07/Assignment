package com.shristi.absdemos;
import java.util.Scanner;

public class ATMMain {
@SuppressWarnings("resource")
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter initial balance: ");
    double initialBalance = scanner.nextDouble();

    Bank account;

    System.out.println("Select account type: ");
    System.out.println("1. Savings Account");
    System.out.println("2. Current Account");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            account = new Savings(initialBalance);
            break;
        case 2:
            account = new Current(initialBalance);
            break;
        default:
            System.out.println("Invalid choice. Exiting...");
            return;
    }

    System.out.println("Account created successfully.");

    while (true) {
        System.out.println("Select an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Current balance: " + account.getBalance());
                break;
            case 4:
                System.out.println("Exiting...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid option.");
        }
    }
}

}
