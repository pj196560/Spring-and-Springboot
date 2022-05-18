package com.lifecycle_method_through_postconstruct_and_postdestroy_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/lifecycle_method_through_postconstruct_and_postdestroy_annotation/prime.xml");
		
		Prime prime = (Prime) context.getBean("num");
		
		System.out.println(prime);
		context.close();

	}

}
