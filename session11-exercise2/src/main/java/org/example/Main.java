package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Account Holder Name : ");
        String accountHolderName = scanner.next();
        System.out.println("Account Number : ");
        int accountNumber = scanner.nextInt();
        System.out.println("Balance : ");
        int balance = scanner.nextInt();
        System.out.println("Amount To Deposit : ");
        int amountToDeposit = scanner.nextInt();
        System.out.println("withdraw Amount : ");
        int withdrawAmount = scanner.nextInt();
       BankAccount account = new BankAccount(accountHolderName,accountNumber,balance);
        System.out.println("Balance Amount when deposited : "+account.deposit(amountToDeposit));
        System.out.println("Balance Amount when withdraw : "+account.withdraw(withdrawAmount));
    }
}