package com.shino.spring4.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conx = new ClassPathXmlApplicationContext("com/shino/spring4/demo1/applicationContext.xml");
		
		Student myBean = (Student) conx.getBean("stubean111");
		
		myBean.show();

	}

}
