package com.agkr.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		
		// Instantiating a spring container
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Register address3 object with spring ioc container
		
		// Retrieve the bean from container
		Employee employee = context.getBean("emp2", Employee.class);
		Address address2 = context.getBean("address", Address.class);
		
		// Call methods on the bean 
		System.out.println(employee);
		System.out.println(address2);
		
		// Close context
		((ClassPathXmlApplicationContext) context).close();

	}

}
