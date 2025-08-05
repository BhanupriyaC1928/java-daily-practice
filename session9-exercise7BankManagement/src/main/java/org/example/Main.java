package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("accountNumber : ");
        int accountNumber = scanner.nextInt();
        System.out.println("balance : ");
        int balance = scanner.nextInt();
        System.out.println("interestRate : ");
        float interestRate = scanner.nextFloat();
        System.out.println("maturityPeriod : ");
        int maturityPeriod = scanner.nextInt();
        Account account = new Account(accountNumber,balance);
        account.displayDetails();
        SavingAcount savingAcount = new SavingAcount(accountNumber,balance,interestRate);
        savingAcount.displayDetails();
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(accountNumber,balance,interestRate,maturityPeriod);
        fixedDepositAccount.displayDetails();
    }
}