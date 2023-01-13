package com.masai;

public class Person {
 
	//dependency 
	private int id;
	private String name;
	private String add;
	private int marks;
	
	
	//Constructor injection point
	public Person(int id, String name, String add, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.marks = marks;
	}
	
	
	public void initMethod() {
	System.out.println("I am inside the init method");
			
	}
	
	
	public void showDetail() {
		System.out.println("Business Logic Method");
		System.out.println("id      : "+id);
		System.err.println("name    : "+name);
		System.out.println("address : "+add);
		System.out.println("marks   : "+marks);
	}
	
}
