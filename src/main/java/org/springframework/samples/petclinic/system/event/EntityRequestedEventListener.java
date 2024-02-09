package org.springframework.samples.petclinic.system.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class EntityRequestedEventListener {

	private static final Logger LOG = Logger.getLogger("EntityRequestedEventListener");

	@EventListener
	private static void onEntityRequested(EntityRequestedEvent event) {
		LOG.info("Entity requested: " + event.getEntityName());
	}

}
