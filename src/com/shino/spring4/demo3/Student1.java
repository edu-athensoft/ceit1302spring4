package com.shino.spring4.demo3;

public class Student1 {
	private int id;
	private String name;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student1() {
		System.out.println("the information is :");
	}

	
	
	
	public Student1(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void show() {
		System.out.println(id+" "+name+" "+address.toString());
	}
	

}
