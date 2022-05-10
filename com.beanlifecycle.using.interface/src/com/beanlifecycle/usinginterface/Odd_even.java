package com.beanlifecycle.usinginterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Odd_even implements InitializingBean,DisposableBean {
	
	private int number;

	public Odd_even() {
		super();
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		System.out.println("property set!!");
		this.number = number;
	}

	@Override
	public String toString() {
		return " number is =" + number;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if(number%2==0)
		{
			System.out.println("it is even");
		}
		else
		{
			System.out.println("it is odd");
		}
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("call destroy method");
		
	}	
	
	
	

}

