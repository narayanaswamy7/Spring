package com.ns.springdemo;

public class BaseBallCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a construction for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune to get a fortune
		return fortuneService.getFortune();
	}

}
