package com.masai;

public class A {

	private String[] names;

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}
	
	public void  showName() {
		
		for(String name:names) {
			System.out.println(name);
		}
		
		
		
	}
}
