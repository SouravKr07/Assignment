package com.shristi.absdemos;

public class Savings extends Bank {
    public Savings(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings deposit successful. Updated balance: " + balance);

}
}