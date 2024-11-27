package com.labs.java.reflections;

public class Account {
    public double balance;

    // Set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Get balance (to be used by subclasses)
    public double getBalance() {
        return balance;
    }

    // Update balance (to be used by subclasses)
    protected void updateBalance(double newBalance) {
        this.balance = newBalance;
    }
}
