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
		super();
	}
	public User( String username, String email) {
		super();
		this.userid = ++counter;
		this.username = username;
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", Account=" + Account + "]";
	}
	

}
