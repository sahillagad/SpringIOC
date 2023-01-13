package com.masai;

public class Person {
 
	//dependency 
	private int id;
	private String name;
	private String add;
	private int marks;
	
	
	
	public void initMethod() {
	System.out.println("I am inside the init method");
	System.out.println("id      : "+id);
	System.out.println("name    : "+name);
	System.out.println("address : "+add);
	System.out.println("marks   : "+marks);	
	}
	
	
	
	//setter injection point
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void showDetail() {
		System.out.println("Business Logic Method");
	    System.out.println("My Id is "+id+" My Name is "+name+" My address is "+add+" My marks is "+marks); 

	 }
	//Disposing method 
	public void distroymethod() {
		
		System.err.println("Your Object Killing Process Start");
		
	}
	
}
