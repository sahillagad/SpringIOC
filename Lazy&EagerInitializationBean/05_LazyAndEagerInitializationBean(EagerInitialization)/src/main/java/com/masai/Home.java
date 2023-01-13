package com.masai;

public class Home {

	private int homeid;
	private String homeName;
	private String add;
	
	public void initMethodHome() {
	System.out.println("I am inside the init Method Of the Home Class");
	System.out.println("My Home Id Is "+homeid+" My Home Name is "+homeName+" home add "+add);	
	}
	
	
	
	
	public Home() {
		super();
		System.out.println("I am inside the Home Constructor");
	}




	public void setHomeid(int homeid) {
		this.homeid = homeid;
	}
	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void funHome() {
	
		System.out.println("Home id      : "+homeid);
		System.out.println("Home Name    : "+homeName);
		System.out.println("Home Address : "+add);
	
	}
	
	//Disposing method 
	public void distroymethodHome() {

		System.err.println("Your Home Object Killing Process Start");

	}
	
	
}
