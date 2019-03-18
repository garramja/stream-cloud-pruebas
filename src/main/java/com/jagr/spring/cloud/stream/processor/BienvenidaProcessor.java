package com.jagr.spring.cloud.stream.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BienvenidaProcessor {

	@Input
	SubscribableChannel bienvenida();


}
