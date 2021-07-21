package com.ns.springbootdemo.demoapp.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" that return Hello World!
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the Server is " + LocalDateTime.now();
	}

	// expose new endpoint for workout
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a Hard 5k!";
	}

	// expose a new endpoint for fortune
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your Lucky Day!";
	}

}
