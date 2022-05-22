package com.spring.Expressopn.language;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/spring/Expressopn/language/applicationContext.xml");
		
		Expression d1 = context.getBean("demo",Expression.class);
		
		System.out.println(d1);
		
		context.close();

	}

}
