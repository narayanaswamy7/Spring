package com.ns.springdemo;

public class FootBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Play Football on every weekend";
	}

	@Override
	public String getDailyFortune() {
		return "Fortune from FootBall Coach!";
	}

	
	
}
