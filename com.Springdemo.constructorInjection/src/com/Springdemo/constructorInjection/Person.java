package com.Springdemo.constructorInjection;

public class Person {
	
	private int ID;
	private String name;
	private String period;
	private Certificate certi;
	
	public Person(int ID,String name,String period,Certificate certi)
	{
		this.ID=ID;
		this.name=name;
		this.period=period;
		this.certi=certi;
				
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "the ID of person is::"+this.ID+"\n"+"and the name is::"+this.name+"\n"+"He/Her were course duration is::"+this.period 
				+"\n"+"certificate name was::"+this.certi.certificate_name;
		
		
	}
	
	

}
