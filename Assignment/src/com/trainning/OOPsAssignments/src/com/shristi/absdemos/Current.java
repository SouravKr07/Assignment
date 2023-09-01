package com.shristi.absdemos;

public class Current extends Bank {
    public Current(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Current withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current deposit successful. Updated balance: " + balance);
    }

}
