package com.athensoft.spring4.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.athensoft.spring4.demo2.Employee2b;

public class ClientApp2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/athensoft/spring4/demo2/applicationContext.xml");
		Employee2b myBean = (Employee2b) context.getBean("empbean2b");
		
		myBean.show();

	}

}
