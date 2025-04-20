package CoreJava;

import java.util.Scanner; 
public class Atm {
    private String accountHolder;
    private double balance;

    public Atm(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount );
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount  );
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    
    public void viewBalance() {
        System.out.println("Current balance: " + balance);
    }
}
