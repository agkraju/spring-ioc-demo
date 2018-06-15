package com.agkr.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		
		// Instantiating a spring container
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from container
		Employee employee = context.getBean("emp", Employee.class);
		
		// Call methods on the bean
		System.out.println(employee);
		
		// Close context
		((ClassPathXmlApplicationContext) context).close();

	}

}
