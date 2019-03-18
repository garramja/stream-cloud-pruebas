package com.jagr.spring.cloud.stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class ControllerTest {

	@GetMapping
	public void test() {
		System.out.println("En el get");
	}

}
