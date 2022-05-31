package com.backend.PhaseOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.Accounts.Account;
import com.backend.Accounts.SavingsAccount;
import com.backend.User.User;

//@SpringBootApplication
public class PhaseOneApplication {

	public static void main(String[] args) {
     System.out.println("Spring Project!");
     User user = new User("Saurav","sauravmeher@company.com");
     Account account = new SavingsAccount(2000);
     user.setAccount(account);
     System.out.print(user);
     //SpringApplication.run(PhaseOneApplication.class, args);
	}

}
