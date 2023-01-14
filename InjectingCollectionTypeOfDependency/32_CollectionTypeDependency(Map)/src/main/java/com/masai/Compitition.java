package com.masai;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Compitition {

   private int id;	
   private String name;
   private String place;
   
   public Map< Collage, Student> collageStudent;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public Map<Collage, Student> getCollageStudent() {
	return collageStudent;
}

public void setCollageStudent(Map<Collage, Student> collageStudent) {
	this.collageStudent = collageStudent;
}
   
   


 public void showDetail() {
	 
	 System.out.println("Name Copmitition : "+name);
	 System.out.println("Place            : "+place);
	
	 Set<Entry<Collage, Student>> entries=collageStudent.entrySet();
	 
	for(Entry<Collage, Student> entry:entries) {
	
		System.out.println("Collage : "+entry.getKey()+"   "+"Student : "+entry.getValue());
	      	
	}
	
	 
	 
	 
 }
   
   
   


	
}
