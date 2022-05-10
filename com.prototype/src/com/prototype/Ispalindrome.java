package com.prototype;

public class Ispalindrome {
	
	private int num;

	public Ispalindrome() {
		this.num=00;
	}

	public Ispalindrome(int num) {
		this.num = num;
	}
	
	
	public void checkpalindrome()
	{
		int num2=num;
		int sum=0;
		System.out.println("original num is::"+num);
		while(num2>0)
		{
			int a = num2%10;
			sum = (sum*10)+a;
			num2=num2/10;
		}
		System.out.println("reverse number is::"+sum);
		if(num==sum)
		{
			System.out.println("it is a palindrome number");
			
		}
		else
		{
			System.out.println("its not palindrome");
		}
		
	}
	
	

}
