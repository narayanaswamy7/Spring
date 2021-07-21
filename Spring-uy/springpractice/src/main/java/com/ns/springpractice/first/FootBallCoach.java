package com.ns.springpractice.first;

public class FootBallCoach implements Coach {

	FortuneService fortuneService;
	
	public FootBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// init-method
	public void initMethod() {
		System.out.println("inside the init method");
	}
	
	// destroy method
	public void destroyMethod() {
		System.out.println("inside the destroy method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "play football for 45 mins daily";
	}

	@Override
	public String getDailyForune() {
		return "FootBall: "+fortuneService.getDailyFortune();
	}

}
