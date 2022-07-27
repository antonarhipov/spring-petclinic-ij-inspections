package org.springframework.samples.petclinic.system.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EntityRequestedEventPublisher {

	private final ApplicationEventPublisher applicationEventPublisher;

	public EntityRequestedEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publish(EntityRequestedEvent event) {
		applicationEventPublisher.publishEvent(event);
	}
}
