package com.labs.java.reflections;

public class AccountMain {
    public static void main(String[] args) {
        // Create a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount();
        // Set initial balance
        savingsAccount.setBalance(10000);
        System.out.println("Initial:");
        savingsAccount.displayBalance();
        // Apply interest
         savingsAccount.calculateBalance();
        // Display updated balance
        System.out.println("After Applying Interest:");
        savingsAccount.displayBalance();
    }
}
