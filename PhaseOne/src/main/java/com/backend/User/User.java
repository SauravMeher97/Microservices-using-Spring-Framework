package com.backend.User;

import com.backend.Accounts.Account;

public class User implements UserInterface {
	private static int counter=1000;
	private int userid;
	private String username;
	private String email;
	
	private Account Account;
	
	
	public Account getAccount() {
		return Account;
	}
	public void setAccount(Account account) {
		Account = account;
	}
	public User() {
		this.userid=++counter;
		System.out.println("User Default Constructor");

	}
	public User( String username, String email) {
		System.out.println("Inside User Class Parameterised Constructor");
		this.userid = ++counter;
		this.username = username;
		this.email = email;
		//this.Account=account;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		System.out.println("Inside set User Id");
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		System.out.println("Inside set User Name");
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Inside set User emailid");
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", Account=" + Account + "]";
	}
	

}
