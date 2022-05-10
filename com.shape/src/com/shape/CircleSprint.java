package com.shape;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleSprint {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Shape c = context.getBean("thecircle",Shape.class);
		
		Shape shape = (Shape) context.getBean("secondcircle");
		Shape d =(Shape) context.getBean("third");
		
		System.out.println(c.calarea());
		System.out.println(shape.calarea());
		System.out.println(d.calarea());
		
		context.close();

	}
	

}
