package com.shino.spring4.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext conx = new ClassPathXmlApplicationContext("com/shino/spring4/demo3/applicationContext.xml");
		
		Student1 stu = (Student1) conx.getBean("stubean1");
		
		stu.show();

	}

}
