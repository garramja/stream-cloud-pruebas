package com.jagr.spring.cloud.stream.consumer;

import com.jagr.spring.cloud.stream.processor.AltaProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding(AltaProcessor.class)
public class AltaConsumer {

	@StreamListener("alta")
	public void alta(String message) {

		System.out.println("Leido del canal alta: " + message);
	}


}
