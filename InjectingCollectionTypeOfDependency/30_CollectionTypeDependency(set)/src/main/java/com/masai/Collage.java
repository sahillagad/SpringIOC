package com.masai;

import java.util.Set;

public class Collage {

	private int collageid;
	private String name;
	private String address;
 	
	private Set<Student> students;
	
	private Set<Teacher> teachers;
   
	private Set<String> course;
	
	public int getCollageid() {
		return collageid;
	}

	public void setCollageid(int collageid) {
		this.collageid = collageid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	
	public Set<String> getCourse() {
		return course;
	}

	public void setCourse(Set<String> course) {
		this.course = course;
	}

	public void showStudent() {
		
		for(Student student:students) {
			System.out.println(student);	
		}

	}
	

	public void showTeacher() {
		
		for(Teacher teacher:teachers) {
			System.out.println(teacher);	
		}
		
	}
	
	
	public void showCourse() {
		for(String c:course) {
			System.out.println(c);	
		}
		
	}
	
}
