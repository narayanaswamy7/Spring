package com.ns.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ns.conference.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public User getUser(
			@RequestParam(value = "firstName", defaultValue = "Hawkee") String firstName,
			@RequestParam(value = "lastName", defaultValue = "Man") String lastName,
			@RequestParam(value = "age", defaultValue = "30") int age) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		System.out.println("User firstName: "+user.getFirstName());
		return user;
	}

}
