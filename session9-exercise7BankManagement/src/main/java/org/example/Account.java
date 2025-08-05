package org.example;

public class Account {
    private int accountNumber;
    private int balance;

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("*****************Account Details ***********************");
        System.out.println("Account Number : " +accountNumber);
        System.out.println("Account Balance : " +balance);
    }
}
