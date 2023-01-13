package com.masai;

public class Department {

	private int depId;
	private String name;
	private String add;
	
	
	
	public Department() {
		super();
		System.out.println("I am inside the Department Constructor");
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void initMethodDepartment() {
		
		System.out.println("I am inside the init Method Of the Department Class");
	    System.out.println("My Dep Id Is "+depId+" department Name "+name+" department address "+add); 
		
	}
	
	public void funDep() {
	
		System.out.println("dep Id   : "+depId);
		System.out.println("dep Name : "+name);
		System.out.println("dep add  : "+add);
		
		
	}
	
	public void distroymethodDepartment() {
		
		System.err.println("Your Department Object Killing Process Start");
	}
}
