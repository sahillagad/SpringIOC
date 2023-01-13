package com.masai;

public class E {
	private String className;

	 
    //Constructor
	public E() {
	super();	
	System.out.println("E class Object Creation Process Start");

	}
	
	
	public void setClassName(String className) {
		this.className = className;
	}
	public void initMethod() {
	System.out.println("I am inside the init Method Of the E class");	
		
	}
	
	
	public void destroyMethod() {
	System.out.println("Your E clas Object Fill Be Available to the garbage collector");	
	}
	
	
	public void funE() {
		System.out.println("I am inside the funE of E class");
		System.out.println("Class Name : "+className);
		
		
	}
	
	
	
}
