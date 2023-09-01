package com.shristi.absdemos;

abstract class Bank {
	protected double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public double getBalance() {
        return balance;
}
}