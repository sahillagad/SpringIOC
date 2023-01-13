package com.masai;

public class Student {

	
	private int roll;
	private String name;
	private int marks;
	
	
	
	// setter injection point

	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	
	

	 public void displayDetails() {
		 
		 System.out.println("Roll No : "+roll);
		 System.out.println("Name    : "+name);
		 System.out.println("Marks   : "+marks);
		
	 }
	
}
