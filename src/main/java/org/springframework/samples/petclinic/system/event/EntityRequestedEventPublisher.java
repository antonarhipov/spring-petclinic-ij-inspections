package org.springframework.samples.petclinic.system.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@DependsOn("generalconfig")
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
