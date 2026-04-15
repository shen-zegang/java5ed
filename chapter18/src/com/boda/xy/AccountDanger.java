package com.boda.xy;
public class AccountDanger implements Runnable {
    private Account acct = new Account();
    public void run() {
       for (int x = 0; x < 50; x++) {
    	  makeWithdrawal(100);
    	  if (acct.getBalance() < 0) {
    	      System.out.println("账户已透支!");
    	  }
       }
    } 
    private void makeWithdrawal(int amt) {
       if (acct.getBalance() >= amt) {
    	//System.out.println(Thread.currentThread().getName()
    	//  + " 开始取款");
    	try {
    	   Thread.sleep(100);
    	} catch(InterruptedException ex) { }
    	acct.withdraw(amt);
    	System.out.println(Thread.currentThread().getName()
    	   + " 取款" + amt + " 余额：" + acct.getBalance());
       } else {
    	 System.out.println("账户余额不足 "
    	   + Thread.currentThread().getName()
    	   + " to withdraw " + acct.getBalance());
       }
    }  
    
    public static void main (String [] args) {
       AccountDanger r = new AccountDanger();
       Thread one = new Thread(r);
       Thread two = new Thread(r);
       one.setName("Fred");
       two.setName("Lucy");
       one.start();
       two.start();
    }
}

