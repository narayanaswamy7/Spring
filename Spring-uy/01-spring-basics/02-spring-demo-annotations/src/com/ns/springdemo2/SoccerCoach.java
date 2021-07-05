package com.ns.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Play Soccer for 45 mins everyday";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
