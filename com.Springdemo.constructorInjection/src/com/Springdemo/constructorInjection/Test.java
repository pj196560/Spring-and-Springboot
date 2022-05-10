package com.Springdemo.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("com/Springdemo/constructorinjection/applicationContext.xml");
		
		
		Person P = context.getBean("myperson",Person.class);
		System.out.println(P.toString());
		context.close();

	}

}
