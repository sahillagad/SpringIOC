package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
 
	 Compitition compitition=context.getBean("com1",Compitition.class);
	 
	 compitition.showDetail();
		
		 
		 
		 
	}
}
