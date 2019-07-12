package com.athensoft.spring4.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.athensoft.spring4.demo2.Employee2a;

public class ClientApp1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/athensoft/spring4/demo2/applicationContext.xml");
		Employee2a myBean = (Employee2a) context.getBean("empbean2a");
		
		myBean.show();

	}

}
