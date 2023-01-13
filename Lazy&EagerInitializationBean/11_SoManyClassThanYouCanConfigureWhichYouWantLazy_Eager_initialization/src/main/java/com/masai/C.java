package com.masai;

public class C {

	private String className;

	 
    //Constructor
	public C() {
	super();	
	System.out.println("C class Object Creation Process Start");

	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void initMethod() {
	System.out.println("I am inside the init Method Of the C class");	
		
	}
	
	
	public void destroyMethod() {
	System.out.println("Your C class Object Fill Be Available to the garbage collector");	
	}
	
	
	public void funC() {
		System.out.println("I am inside the funC of C class");
		System.out.println("Class Name : "+className);
		
		
	}
	
	
	
}
