package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		 /*
		  * The Spring Container by default fallow 
		  * the egar initalization of bean
		  * when we configure xml file / xml file loaded into the memory
		  * spring container will create object pass dependency/resolve dependency
		  * init method also we called 
		  * 
		  * but we want lazy initalization than we use 
		  *lazy-init="true"; proverty given the at configartion where our spring bean configure
		  */

	
		 
		 // when we pulling Object than it will craete object
		 Department dep= context.getBean("departmentObj",Department.class);
		// we pull the that object that time it will create object
        // resolve the dependency of spring bean
		
		
	}
}
