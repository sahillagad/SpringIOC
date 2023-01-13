package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	 
	 	// by default our scope is single-ton
		//bean object is ready we want object is craeted at time 
//		of we call getbean method 
//		for this we have two option one is we make 
//		the  1]lazy-init="true"
//second option  is   2] scope="prototype"
		
		// at time of we configration/xml file load
		
	 
		context.getBean("p1",Person.class);  // pulling object than it will create object
		
		
	 	
	 	
	 	
		
		
	}
}
