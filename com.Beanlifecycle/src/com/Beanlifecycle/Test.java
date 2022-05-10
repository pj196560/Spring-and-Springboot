package com.Beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("com/Beanlifecycle/lifecycle.xml");
		
		Book B = (Book) context.getBean("mybook");
		System.out.println(B);
		context.close();
	}

}
