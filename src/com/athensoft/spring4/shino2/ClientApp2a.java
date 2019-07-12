package com.athensoft.spring4.shino2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.athensoft.spring4.shino2.Employee2b;

public class ClientApp2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/athensoft/spring4/shino2/applicationContext.xml");

		Employee2a emp = (Employee2a) context.getBean("employeebean2a");
		
		emp.show();

	}

}
