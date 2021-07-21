package com.ns.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ns.springrest.model.Message;

@RestController
public class MesageController {

	@GetMapping("/message")
	public Message getMessage() {
		return new Message("demo message");
	}
	
	@PostMapping("/message")
	public Message portMessage(@RequestBody Message message) {
		return message;
	}
}
