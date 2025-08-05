package org.example;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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
        if(balance>0) {
            this.balance = balance;
        }
    }

    public boolean deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited Amount : " +balance);
            return  true;
        }
        return false;
    }

    public boolean withdraw(int amount){
        if (balance!=0){
            balance-=amount;
            System.out.println("Balance Amount after withdraw : " +balance);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
