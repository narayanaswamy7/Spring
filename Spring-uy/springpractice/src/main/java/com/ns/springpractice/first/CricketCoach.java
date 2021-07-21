package com.ns.springpractice.first;

import lombok.Data;

@Data
public class CricketCoach implements Coach {
	
	private String email;
	private String team;

	FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("inside CricketCoach no-arg constructor!");
	}

	@Override
	public String getDailyWorkout() {
		return "Practing batting for 45 mins";
	}

	@Override
	public String getDailyForune() {
		return fortuneService.getDailyFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside CricketCoach setFortuneService()");
		this.fortuneService = fortuneService;
	}

}
