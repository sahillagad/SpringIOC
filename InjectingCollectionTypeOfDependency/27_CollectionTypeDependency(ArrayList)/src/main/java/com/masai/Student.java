package com.masai;

public class Student {

	
	private int roll;
	private String name;
	private int marks;
	
	
	
	// Constructor injection point
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	

	
	

	 public void displayDetails() {
		 
		 System.out.println("Roll No : "+roll);
		 System.out.println("Name    : "+name);
		 System.out.println("Marks   : "+marks);
		
	 }




	
}
