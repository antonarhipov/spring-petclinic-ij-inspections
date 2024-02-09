package org.springframework.samples.petclinic.system.event;

import org.springframework.context.ApplicationEvent;

public class EntityRequestedEvent extends ApplicationEvent {

	private final String entityName;

	public EntityRequestedEvent(String entityName) {
		super(entityName);
		this.entityName = entityName;
	}

	public String getEntityName() {
		return entityName;
	}

}
