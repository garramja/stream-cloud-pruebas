package com.jagr.spring.cloud.stream.processor;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface AltaProcessor {

	@Input
	SubscribableChannel alta();

}
