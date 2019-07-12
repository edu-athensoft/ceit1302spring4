package com.athensoft.spring4.shino2;

//不同注入方法（构造器注入，setter注入）

public class Employee2b {
	
	private int id;  
	private String name;  
	
	private Address address;
	  
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee2b() {
		System.out.println("def cons");}  
	  
	public Employee2b(int id) {
		this.id = id;}  
	  
	public Employee2b(String name) { 
		this.name = name;}  
	  
	public Employee2b(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	public Employee2b(Address address) {
		this.address = address;
	}
	
	public Employee2b(int id,String name,Address address) {
		this.id = id;
		this.name=name;
		this.address = address;
	}
	  
	public void show(){  
	    System.out.println(id+" "+name+" "+address);  
	}  
	  
}
