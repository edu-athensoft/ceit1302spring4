package com.athensoft.spring4.shino1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//�ڶ��ַ�����������
public class ClientApp2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/athensoft/spring4/shino1/applicationContext.xml");
		
		Student myBean = (Student) context.getBean("studentbean");
		
		myBean.displayInfo();
		
	}
	}

