package com.Standalone_collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Standalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("com/Standalone_collections/pali.xml");
		
		Person person = (Person) context.getBean("person1");
		System.out.println(person);
		System.out.println("_____________________________________________________________________________");
		System.out.println(person.getFreindlist());
		System.out.println(person.getFreindlist().getClass().getName());
		System.out.println("_______________________________________________________________________________");
		System.out.println(person.getPhonenumber());
		System.out.println(person.getPhonenumber().getClass().getName());
		System.out.println("_________________________________________________________________________________");
		System.out.println(person.getCoursefees());
		System.out.println(person.getCoursefees().getClass().getName());
		System.out.println("_________________________________________________________________________________");

		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());
		context.close();


	}

}

