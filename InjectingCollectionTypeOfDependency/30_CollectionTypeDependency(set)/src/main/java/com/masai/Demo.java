package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Collage  collage= context.getBean("c1",Collage.class);
		
		collage.showStudent();
		System.out.println("---------------------------------------"); 
	
		
		collage.showCourse();
		

		System.out.println("---------------------------------------");
		
		
		collage.showTeacher();

		
		System.out.println("---------------------------------------");
		
	}
}