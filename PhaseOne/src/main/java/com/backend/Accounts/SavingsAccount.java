package com.backend.Accounts;

public class SavingsAccount implements Account {
    private int balance;
    private int amount;
    
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public SavingsAccount() {
    	System.out.println("Inside Savings account default constructor");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public SavingsAccount(int balance) {
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
		return "SavingsAccount [balance=" + balance + ", amount=" + amount + "]";
	}
	

      
      
}
