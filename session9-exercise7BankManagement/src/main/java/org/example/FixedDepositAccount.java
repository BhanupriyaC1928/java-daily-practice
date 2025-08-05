package org.example;

public class FixedDepositAccount extends SavingAcount{
    private int maturityPeriod;

    public FixedDepositAccount(int accountNumber, int balance, float interestRate, int maturityPeriod) {
        super(accountNumber, balance, interestRate);
        this.maturityPeriod = maturityPeriod;
    }

    public int getMaturityPeriod() {
        return maturityPeriod;
    }

    public void setMaturityPeriod(int maturityPeriod) {
        this.maturityPeriod = maturityPeriod;
    }
    @Override
    public void displayDetails() {
        System.out.println("*****************Fixed Deposit Account Details ***********************");
        System.out.println("Account Number : " +getAccountNumber());
        System.out.println("Account Balance : "+getBalance());
        System.out.println("Interest Rate : " +getInterestRate());
        System.out.println("Maturity Period : "+maturityPeriod);
    }
}
