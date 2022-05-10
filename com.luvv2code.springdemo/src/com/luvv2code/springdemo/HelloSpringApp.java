package com.luvv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach hiicoach = context.getBean("seecoach",Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
	
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(hiicoach.getDailyWorkout());
		System.out.println(hiicoach.getDailyFortune());
		// close the context
		context.close();

	}

}
