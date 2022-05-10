package com.addition;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_addition_demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("com/addition/applicationContext.xml");
		
		Addition addi = context.getBean("add",Addition.class);
		addi.dosum();
		context.close();

	}

}
