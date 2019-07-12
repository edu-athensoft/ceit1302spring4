package com.athensoft.spring4.shino1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp3 {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/athensoft/spring4/shino1/applicationContext.xml");

	Employee emp = (Employee) context.getBean("employeebean");
	
	emp.show();
	}
}
