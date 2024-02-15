package com.lagnada.modernj.fundamentals;

public class BankAccount {
  private double balance; // Private to enforce encapsulation

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }
}
