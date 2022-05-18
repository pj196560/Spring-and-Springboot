package com.Stereotype_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Value {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("com/Stereotype_annotation/book.xml");
		
		Book book = (Book) context.getBean("book1");
		System.out.println(book);
		System.out.println("_____________________________________________________________________________");
		System.out.println(book.getBookname());
		System.out.println(book.getBookname().getClass().getName());
		System.out.println("_______________________________________________________________________________");
		System.out.println(book.getPrice());
		System.out.println(book.getPrice().getClass().getName());
		System.out.println("_________________________________________________________________________________");
		System.out.println(book.getWritter());
		System.out.println(book.getWritter().getClass().getName());
		System.out.println("_________________________________________________________________________________");
		context.close();
		
	}

}
