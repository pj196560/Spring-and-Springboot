package com.xml;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan(basePackages = " com.xml")


public class Xml {
	@Bean
	public Address getaddress()
	{
		return new Address();
	}
	
	
	@Bean
	public Employee getemployee()
	{
		Employee employee = new Employee( null, 0, 0, null, false, getaddress());
		
		return employee;
	}
	
}
