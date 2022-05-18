package com.lifecycle_method_through_postconstruct_and_postdestroy_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;




public class Prime {

	private int number;

	public Prime() {
		super();

	}

	public Prime(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "the number is::"+this.number;
	}
	
	@PostConstruct
	public void init()
	{
		int flag=0;
		int i;
		for(i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				flag=flag+1;
			}
		}
		
		if(flag==2)
		{
			System.out.println("the number is prime");
			
		}
		
		else if(number==0 || number==1)
		{
			System.out.println("number 1 and 0 is composite number");
		}
		
		else
		{
			System.out.println("the number is  not  prime number");
		}
		
	}
	
	@PreDestroy
	public void destroy()
	{ 
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.println("the number is divisible by::"+i);
			}
		}
	}

}
