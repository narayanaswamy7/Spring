package com.ns.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach: " + fortuneService.getFortune();
	}

}
