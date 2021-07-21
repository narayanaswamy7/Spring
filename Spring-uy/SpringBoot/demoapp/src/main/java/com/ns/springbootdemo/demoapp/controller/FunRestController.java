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

}
