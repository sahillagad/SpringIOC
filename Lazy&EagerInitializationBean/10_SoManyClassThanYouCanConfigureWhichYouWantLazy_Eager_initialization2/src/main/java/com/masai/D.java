package com.masai;


public class D {

	private String className;

	 
    //Constructor
	public D() {
	super();	
	System.out.println("D class Object Creation Process Start");

	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void initMethod() {
	System.out.println("I am inside the init Method Of the D class");	
		
	}
	
	
	public void destroyMethod() {
	System.out.println("Your D class Object Fill Be Available to the garbage collector");	
	}
	
	
	public void funD() {
		System.out.println("I am inside the funD of D class");
		System.out.println("Class Name : "+className);
		
		
	}
	
	
	
	
	
}
