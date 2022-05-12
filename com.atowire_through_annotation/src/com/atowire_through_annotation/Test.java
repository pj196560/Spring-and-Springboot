package com.atowire_through_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/atowire_through_annotation/percentage.xml");
		
		Percentage percentage = (Percentage) context.getBean("stud");
		
		System.out.println(percentage);
		System.out.println(percentage.stud());
		System.out.println(percentage.stud1());
		context.close();
		

	}

}
