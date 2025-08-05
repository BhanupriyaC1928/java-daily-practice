package org.example;

public class SavingAcount extends Account{
    private float interestRate;

    public SavingAcount(int accountNumber, int balance, float interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public void displayDetails() {
        System.out.println("*****************Saving Account Details ***********************");
        System.out.println("Account Number : " +getAccountNumber());
        System.out.println("Account Balance : "+getBalance());
        System.out.println("Interest Rate : " +interestRate);
    }
}
