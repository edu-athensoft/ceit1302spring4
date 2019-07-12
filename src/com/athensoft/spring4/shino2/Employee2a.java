package com.athensoft.spring4.shino2;

public class Employee2a {
	private int id;  
	private String name;  
	
	private Address address;
	  
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee2a() {
		System.out.println("def cons");}  
	  
	public Employee2a(int id) {
		this.id = id;}  
	  
	public Employee2a(String name) { 
		this.name = name;}  
	  
	public Employee2a(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	
	public  Employee2a(Address address) {
		this.address = address;
	}
	public void show(){  
	    System.out.println(id+" "+name);  
	}  
	  
}