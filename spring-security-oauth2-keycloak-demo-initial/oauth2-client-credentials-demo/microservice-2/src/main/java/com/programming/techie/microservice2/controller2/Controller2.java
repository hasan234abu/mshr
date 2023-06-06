package com.programming.techie.microservice2.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;

@RestController
public class Controller2 {

	@GetMapping("/microservice2/home")
	@ResponseStatus(HttpStatus.OK)
	public String helloRestTemplate() {
		return "hello";
	}
}
