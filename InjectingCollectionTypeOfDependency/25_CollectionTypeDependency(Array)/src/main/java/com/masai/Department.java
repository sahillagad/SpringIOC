package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Department {

	int depid;
	String name;
	
	// collection type dependency
	String[] address;
	
	// collection type dependency
	Person[]  persons;

	

	public int getDepid() {
		return depid;
	}


	public void setDepid(int depid) {
		this.depid = depid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getAddress() {
		return address;
	}


	public void setAddress(String[] address) {
		this.address = address;
	}


	public Person[] getPersons() {
		return persons;
	}


	public void setPersons(Person[] persons) {
		this.persons = persons;
	}


	public void showAddress() {
		
		for(String add:address) {
			
			System.out.println(add);
		}
		
	}
	
	
	public void showPeople() {
		
		for(Person person:persons) {
			
			System.out.println(person);
		}
		
	}
	
	
	


}
