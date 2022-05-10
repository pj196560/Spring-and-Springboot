package com.luvv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "hey bro today is my lucky day";
	}

}
