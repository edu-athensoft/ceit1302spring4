package com.athensoft.spring4.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/athensoft/spring4/demo1/applicationContext.xml");
		Employee myBean = (Employee) context.getBean("empbean");
		myBean.sayHi();
	}
}
