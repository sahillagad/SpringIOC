package com.masai;

import java.util.List;

public class Collage {

	private String collageName;
	
	
	//collection type dependency 
	// list of object
	private List<Student> students;
	
	
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getCollageName() {
		return collageName;
	}
	public List<Student> getStudents() {
		return students;
	
	}
	
	
	public void ShowStudent() {
	
		for(Student stu:students) {
			
			stu.displayDetails();
		  System.out.println("-----------------------------");
		}
	
	}
	
}
