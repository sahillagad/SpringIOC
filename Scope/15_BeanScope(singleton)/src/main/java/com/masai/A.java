package com.masai;

public class A {

	private String className;

	 
    //Constructor
	public A() {
	super();
	System.out.println("A class Object Creation Process Start");
		
	}
	
	
	public void setClassName(String className) {
		this.className = className;
	}


	public void initMethod() {
	System.out.println("I am inside the init Method Of the A class");	
		
	}
	
	
	public void destroyMethod() {
	System.out.println("Your A clas Object Fill Be Available to the garbage collector");	
	}
	
	
	public void funA() {
		System.out.println("I am inside the funA of A class");
		System.out.println("Class Name : "+className);
	}
	
	
	
}
