package com.backend.PhaseOne;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.backend.Accounts.Account;
import com.backend.Accounts.SavingsAccount;
import com.backend.User.User;

@ComponentScan({"com.backend.Accounts","com.backend.User"})
public class PhaseOneApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext factory  = new AnnotationConfigApplicationContext(PhaseOneApplication.class);
		System.out.println("Bean names: " + Arrays.toString(factory.getBeanNamesForType(PhaseOneApplication.class)));
		
		//User user = (User)factory.getBean("user");
		User user = (User)factory.getBean("user","Saurav Meher","Saurav@Company.com");
        
		
		System.out.println("User account type"+user.getAccount());
		
		System.out.println("User!!!"+user);


		
	}

}
