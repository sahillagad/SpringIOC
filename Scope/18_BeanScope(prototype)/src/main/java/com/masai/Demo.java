package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	 	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	 	A a=context.getBean("aobj",A.class);
	
		A a1=context.getBean("aobj",A.class);
	 	
	 	
	 	System.out.println("---------------------");
	 	
	 	System.out.println(a.className);
    
	 	
	 	a1.className="Alpha class";
	 	
	 	
	 	
	 	System.out.println(a.className);
	 	
	 	
		
		
		
	}
}
