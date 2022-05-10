package com.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("com/prototype/pali.xml");//load the configuration files
		
		Ispalindrome pali = context.getBean("mypali",Ispalindrome.class); //create the instance
	    
		Ispalindrome pal = context.getBean("mypali",Ispalindrome.class);//create the instance
		boolean result =(pali==pal);//check is it true or false?
		
		System.out.println("the memory location of pali is:: "+pali+"\n");//print the location of pali instance
		System.out.println("the memory location of pal is:: "+pal+"\n"); //location of pal instance
		System.out.println(result); //it will return false because the scope is prototype thats why location of pali and pal 
		//instance will different; note= if we not provide any scope then the by default scope will singleton where it returns true
		 // Because it create only single instance ;
		pali.checkpalindrome();
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Ispalindrome number = context.getBean("myclass",Ispalindrome.class);//create the instance
		Ispalindrome F = context.getBean("myclass",Ispalindrome.class);//create the instance
		boolean result1 =(number==F);//check is it true or false?
		System.out.println("the memory location of pali is:: "+number+"\n");//print the location of number instance
		System.out.println("the memory location of pal is:: "+F+"\n"); //location of pal instance
		System.out.println("cheak True or false:: "+result1); //it will return True because the scope is by default is singleton thats why location of number and f 
		//instance will Same;
		number.checkpalindrome();
		
		context.close();
	}

}
