package com.boda.xy;

public class Account {
private int balance = 10000;

public void deposit(int amount) {   // 存款方法
   balance = balance + amount;
}

public void withdraw(int amount) {  // 取款方法
balance = balance - amount;
}

public int getBalance() {  // 返回账户余额
return balance;
}
}

