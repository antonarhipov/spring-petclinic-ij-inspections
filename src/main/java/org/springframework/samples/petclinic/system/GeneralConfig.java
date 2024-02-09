package org.springframework.samples.petclinic.system;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class GeneralConfig {

	private final String welcomeText = "Welcome to the most broken Spring Petclinic project";

	public String getWelcomeText() {
		return welcomeText;
	}

}
