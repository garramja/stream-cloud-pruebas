package com.jagr.spring.cloud.stream.consumer;

import com.jagr.spring.cloud.stream.processor.BienvenidaProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(BienvenidaProcessor.class)
public class BienvenidaConsumer {

	@StreamListener("bienvenida")
	public void process(String message) {

		System.out.println("Leido del canal bienvenida: " + message);
	}

}
