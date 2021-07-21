package com.ns.springdemo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.MimeMailMessage;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.name}")
	private String name;

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getDailyWorkout() {
		return "swim 1000 meters as a warm up!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
