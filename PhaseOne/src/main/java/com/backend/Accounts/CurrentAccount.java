package com.backend.Accounts;

public class CurrentAccount implements Account {
    private int balance;
    
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

}
