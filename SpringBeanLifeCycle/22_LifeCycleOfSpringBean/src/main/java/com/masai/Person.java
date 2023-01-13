package com.masai;

public class Person {

	

	String name;
	String address;
	String pincode;
	
	public Person() {
		super();
		System.out.println("I am inside the Person class Constructor");
	}
	
	public void initMethod() {
		System.out.println("I am inside the init Method");
		System.out.println("Name     : "+name);
		System.out.println("Address  : "+address);
		System.out.println("Pincode  : "+pincode);
		
		
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	public void showPerson() {
		System.out.println("Name     : "+name);
		System.out.println("Address  : "+address);
		System.out.println("Pincode  : "+pincode);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
	
}
