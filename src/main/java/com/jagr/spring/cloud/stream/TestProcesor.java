package com.jagr.spring.cloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface TestProcesor {

//	@Output
	MessageChannel salidas();

//	@Input
	SubscribableChannel entradas();

}
