package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
 
	   Department depart=  context.getBean("HR",Department.class);
	 	
	   System.out.println(depart);
	 
	    depart.showAddress();
	    System.out.println("--------------");
	    depart.showPeople();
		
		
	}
}
