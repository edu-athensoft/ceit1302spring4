package com.athensoft.spring4.demo1;

public class Employee {
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHi() {
		System.out.println("Hi,"+this.name);
	}
}
