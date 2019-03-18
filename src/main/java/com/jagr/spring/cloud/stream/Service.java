package com.jagr.spring.cloud.stream;

import java.util.Collections;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.binding.BinderAwareChannelResolver;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private BinderAwareChannelResolver resolver;

//	@Autowired
//	private Processor procesor;

	public void send(String message) {

		String formatedMessage = UUID.randomUUID().toString();

		System.out.println("Service, enviando a " + message + " " + formatedMessage);

//		procesor.output().send(new GenericMessage<>("ueeepppp"));

		resolver.resolveDestination(message)
			.send(MessageBuilder.createMessage(formatedMessage,
				new MessageHeaders(Collections.singletonMap(MessageHeaders.CONTENT_TYPE,
					"application/json"))));
	}

}
