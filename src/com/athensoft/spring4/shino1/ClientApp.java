package com.athensoft.spring4.shino1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApp {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("com/athensoft/spring4/shino1/applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student = (Student) factory.getBean("studentbean");
		
		student.displayInfo();
		
		
	}
	

}
