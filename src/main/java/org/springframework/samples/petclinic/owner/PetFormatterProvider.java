package org.springframework.samples.petclinic.owner;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PetFormatterProvider {

	@Bean(initMethod = "init")
	public PetFormatter petFormatter() {
		return new PetFormatter();
	}

	public class PetFormatter {

		public String format(Pet pet) {
			return pet.getName();
		}
	}
}
