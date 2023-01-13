package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
 
     Order order= context.getBean("o1",Order.class);
  
     order.showProduct();
  
     
    
}

}