package com.beanlifecycle.usinginterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springdemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("com/beanlifecycle/usinginterface/interface.xml");
		
		Odd_even A1 = (Odd_even) context.getBean("myodd");
		
		System.out.println(A1);
		context.close();
	}

}
