package com.jagr.spring.cloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

//@EnableBinding(PersonaProcesor.class)
public class PersonasConsumer {

//	@StreamListener("pepe")
	public void process(String message) {

		System.out.println("Leido del canal personas: " + message);
	}


}
