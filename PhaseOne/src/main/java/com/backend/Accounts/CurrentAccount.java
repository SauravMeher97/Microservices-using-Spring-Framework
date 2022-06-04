package com.backend.Accounts;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@ComponentScan
@Component("CurrentAccount")
@Scope("prototype")
@Primary
public class CurrentAccount implements Account {
    private int balance;
    private int amount;
    
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

    
    public CurrentAccount() {
    	System.out.println("Inside current account default constructor");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
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
		return "CurrentAccount [balance=" + balance + ", amount=" + amount + "]";
	}

}
