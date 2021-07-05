package com.ns.springdemo2;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of Strings
	private String[] data = { "beware of wolf in the sheep's clothing", "diligence is the mother of good luck",
			"the journey is the reward" };

	// create a random number
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random String from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
