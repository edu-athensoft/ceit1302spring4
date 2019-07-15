package com.shino.spring4.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientAPPEmployee {
	
	public static void main(String[] args) {
		
		ApplicationContext conx = new ClassPathXmlApplicationContext("com/shino/spring4/demo2/applicationContext.xml");
		
		Employee emp = (Employee) conx.getBean("empbean");
		
		emp.showResult();
		
	}

}
