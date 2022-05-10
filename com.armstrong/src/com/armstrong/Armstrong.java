package com.armstrong;
import java.lang.Math;


public class Armstrong {
	

	private int num;
	public Armstrong()
	{
		this.num = 10;
		System.out.println("the value is::"+num);

	}
	
	public Armstrong(int num)
	{
		this.num = num;
		System.out.println("the value is::"+num);
	}
	
    public String checkarmstrong()
    {
    	int num2=num;
    	int num3 = num;
    	int digit = 0;
    	int count=0;
    	int rev;
    	int sum = 0;
    	
    	while(num2>0)
    	{
    		digit = digit%10;
    		count = count+1;
    		num2 = num2/10;	
    	}
    	System.out.println("the total count is::"+count);
		for(int i = 0;i<count;i++)
    	{
    		rev = num3%10;
    		sum = (int) (sum+Math.pow(rev,count));
    		num3 = num3/10;	
    	}
		System.out.println("the total sum of power of count of digit is::"+sum);
    	if(num==sum)
    	{
    		return "it is a armstrong";
    	}
    	else
    	{
    		return "it is a non-armstrong";
    	}
    }

}
