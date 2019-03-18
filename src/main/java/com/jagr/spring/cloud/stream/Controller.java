package com.jagr.spring.cloud.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

	@Autowired
	private Service service;

	@PostMapping("/inputs")
	public ResponseEntity<String> post(@RequestBody String message) {

		System.out.println("En el controller");

		service.send(message);

		return new ResponseEntity<>(message, HttpStatus.OK);
	}

}
