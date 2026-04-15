package com.boda.xy;

import java.time.LocalDate;

public class Account {
    private int id;
    private double balance;
    private double annulInterestRate;
    private LocalDate dateCreated;
    public Account() {
        super();
    }
    public Account(int id, double balance) {
        super();
        this.id = id;
        this.balance = balance;
        dateCreated = LocalDate.now();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnulInterestRate() {
        return annulInterestRate;
    }
    public void setAnnulInterestRate(double annulInterestRate) {
        this.annulInterestRate = annulInterestRate;
    }
    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
}
