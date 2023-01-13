package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person=context.getBean("personObj",Person.class);
		 
		person.showDetail();
	
	  ClassPathXmlApplicationContext context2=(ClassPathXmlApplicationContext)context;
	  context2.close();
		
		
		
		
	}
}