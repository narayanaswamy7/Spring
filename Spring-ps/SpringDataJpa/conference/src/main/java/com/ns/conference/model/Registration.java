package com.ns.conference.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Registration {

	@NotNull
	@NotBlank
	@NotEmpty
	private String name; 
	
}
