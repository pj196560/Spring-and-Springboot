package com.luvv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
