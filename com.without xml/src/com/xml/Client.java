package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(Xml.class);
		
		Employee employee = context.getBean("getemployee",Employee.class);
		
		System.out.println(employee);
		//employee.toString();
		((AbstractApplicationContext) context).close();
	}

}
