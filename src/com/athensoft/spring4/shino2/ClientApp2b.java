package com.athensoft.spring4.shino2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/athensoft/spring4/shino2/applicationContext.xml");

		Employee2b emp = (Employee2b) context.getBean("employeebean2b");
		
		emp.show();

	}

}
