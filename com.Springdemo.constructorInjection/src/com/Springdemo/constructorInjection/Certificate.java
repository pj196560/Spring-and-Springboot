package com.Springdemo.constructorInjection;

public class Certificate {
	
    public String certificate_name;

	public Certificate(String certificate_name) {

		this.certificate_name = certificate_name;
	}
	
	public String toString()
	{
		return "\n certificate name was::"+this.certificate_name;
		
	}
	
	
	

}
