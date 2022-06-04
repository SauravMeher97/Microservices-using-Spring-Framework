package com.backend.PhaseOne;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.backend.Accounts.Account;
import com.backend.Accounts.SavingsAccount;
import com.backend.User.User;

//@SpringBootApplication
public class PhaseOneApplication {

	public static void main(String[] args) {
		
		//Using XmlBeanFactory( for legacy code understanding)
		BeanFactory factory;
		factory  = new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("before fetching beans");
		
		User user = (User) factory.getBean("user");
		
		System.out.println(user);
		System.out.println("User Account details:"+ user.getAccount());
		System.out.println("after fetching beans");

		
//		User user2 = (User) factory.getBean("user");
//		System.out.println(user2);
		
	}

}
