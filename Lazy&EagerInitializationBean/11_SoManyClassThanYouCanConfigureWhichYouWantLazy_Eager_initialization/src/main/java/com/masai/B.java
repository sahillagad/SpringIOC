package com.masai;

public class B {
	private String className;

	 
    //Constructor
	public B() {
	super();	
	System.out.println("B class Object Creation Process Start");

	}
	
	
	public void setClassName(String className) {
		this.className = className;
	}
	public void initMethod() {
	System.out.println("I am inside the init Method Of the B class");	
		
	}
	
	
	public void destroyMethod() {
	System.out.println("Your B class Object Fill Be Available to the garbage collector");	
	}
	
	
	public void funB() {
		System.out.println("I am inside the funB of B class");
		System.out.println("Class Name : "+className);
		
		
	}
	
	
	
	
}
