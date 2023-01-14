package com.masai;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collage {

	private int collageId;
	private String collageName;

	Map<Student,String> studentdetail;

	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public Map<Student, String> getStudentdetail() {
		return studentdetail;
	}

	public void setStudentdetail(Map<Student, String> studentdetail) {
		this.studentdetail = studentdetail;
	}
	
	public void showStudentDetails() {
		
		
	Set<Entry<Student, String>> entries=studentdetail.entrySet();
	
	for(Entry<Student, String> entry:entries) {
		
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
		
		
	}
	
	
	
}
