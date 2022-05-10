package com.addition;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("integer constructor called and injection ");
	}
	//overloading constructor but the data type is change
	public Addition(double a,double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("double constructor called and injection ");
	}
	//overloading constructor but the data type is change

	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String constructor called and injection ");
	}
	
	public void dosum()
	{
		System.out.println("the value of a::"+a);
		System.out.println("the value of b::"+b);
		System.out.println("the sum is::"+(this.a+this.b));
	}
	
	
	
}

