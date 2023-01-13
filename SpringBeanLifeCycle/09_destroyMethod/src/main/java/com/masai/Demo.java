package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	
		// configure xml fill/loaded into the memeroy
        //than it will create object resolve dependency

	 	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		
	
	 	ClassPathXmlApplicationContext context2=(ClassPathXmlApplicationContext)context;
	   
	 	context2.close();
	 	
	 	
		
	}
}
