package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	 	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	 	A a=context.getBean("aobj",A.class);
	 	
	 	A a1=context.getBean("aobj1",A.class);
	 	
	 	
	 	/*here A class Object Create Two time but we give different id give and registered that in the container 
	 	 *but this aobj id and aobj1 id scope also single ton if we try  to craete A class object with only aobj id it will give same object 
	 	 * 
	 	 */
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
