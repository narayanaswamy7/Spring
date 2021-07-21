package com.ns.springpractice.first;

public class BaseBallCoach implements Coach {

	FortuneService fortuneService;

	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on the batting practice!";
	}

	@Override
	public String getDailyForune() {
		return fortuneService.getDailyFortune();
	}

}
