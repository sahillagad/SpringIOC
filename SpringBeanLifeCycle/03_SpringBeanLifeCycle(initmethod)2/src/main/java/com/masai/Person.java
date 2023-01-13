package com.masai;

public class Person {
 
	//dependency 
	private int id;
	private String name;
	private String add;
	private int marks;
	
	

	public Person() {
		System.out.println("start Construtor Injection Point");
		System.out.println("id      : "+id);
		System.err.println("name    : "+name);
		System.out.println("address : "+add);
		System.out.println("marks   : "+marks);
		System.out.println("end Construtor Injection Point");
	}
	

	//setter injection point
	public void initMethod() {
	System.out.println("start init method");
	System.out.println("id      : "+id);
	System.out.println("name    : "+name);
	System.out.println("address : "+add);
	System.out.println("marks   : "+marks);
	System.out.println("end init method");
	}
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
		System.out.println("start showDetail method");
		System.out.println("Business Logic Method");
		System.out.println("id      : "+id);
		System.out.println("name    : "+name);
		System.out.println("address : "+add);
		System.out.println("marks   : "+marks);
		System.out.println("end showDetail method");
	}
	
}
