package com.backend.Accounts;

public class SavingsAccount implements Account {
    private int balance;

	
	public SavingsAccount(int balance) {
		super();
		this.balance = balance;
	}

	@Override
	public int deposit(int amount) {
		 balance=balance-amount;
		 return balance;
		// TODO Auto-generated method stub	
	}

	@Override
	public int credit(int amount) {
		 balance=balance+amount;
         return balance;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + "]";
	}

      
      
}
