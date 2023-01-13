package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	 	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	 	A a=context.getBean("aobj",A.class);
	 	A a1=context.getBean("aobj1",A.class);
	 	
	 	if(a==a1) {
	 		System.out.println("a==a1 : "+(a==a1));
	 		System.err.println("Both variable pointing To the Same Object");
	 		
	 	}
	 	else {
	 		System.out.println("a==a1 : "+(a==a1));
	 		System.err.println("Both variable pointing To the Different Object");
	
	 	}
	 	
		
		
		
	}
}
