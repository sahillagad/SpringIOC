package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	 	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	 	A a=context.getBean("aobj",A.class);
	 	
	 	System.out.println(a.className);
	 	
	 	
	 	
	 	A a1=context.getBean("aobj",A.class);
	 	a1.className="Alpha class"; // here we change name with a1 
	 	
	 	
	 	
	 	System.out.println(a.className);
	 	

	 	
	 	
		
		
		
	}
}
