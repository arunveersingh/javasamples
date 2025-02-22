package com.oopsfeedmecode.shorts.one;

public record BankAccount(String accountNumber, double balance) {
    public BankAccount deposit(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Deposit amount must be positive");
        return new BankAccount(accountNumber,
                balance + amount);
    }

    public BankAccount withdraw(double amount) {
        if (amount < 0 || amount > balance)
            throw new IllegalArgumentException("Invalid withdraw amount");
        return new BankAccount(accountNumber,
                balance - amount);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

