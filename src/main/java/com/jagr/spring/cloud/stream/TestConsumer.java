package com.jagr.spring.cloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

//@EnableBinding(Processor.class)
public class TestConsumer {

//	@StreamListener(Processor.INPUT)
	public void process(String message) {
		System.out.println("Leido del canal: " + message);
	}

}
