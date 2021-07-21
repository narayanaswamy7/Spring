package com.ns.springpractice.first;

public class TrackCoach implements Coach {

	FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyForune() {
		return "Hi: "+fortuneService.getDailyFortune();
	}

}
