package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Department {

	int depid;
	String name;
	
	// collection type dependency
	List<String> address;
	
	// collection type dependency
	List<Person> persons;

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

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public List<Person> getPersons() {
		return persons;
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
	
	
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}


}
