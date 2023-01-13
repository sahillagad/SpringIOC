package com.masai;

public class Person {

	
	String name;
	String address;
	String pincode;
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
