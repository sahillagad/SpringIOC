package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	 	Person person= context.getBean("p1",Person.class); 
		System.out.println(person);
	 	
	 	person.name="Ram";
	 	
	 	
	 	Person person2=context.getBean("p1",Person.class);
	 	
	 	System.out.println(person2.name);
		
		
	}
}
