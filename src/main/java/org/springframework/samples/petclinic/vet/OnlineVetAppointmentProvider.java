package org.springframework.samples.petclinic.vet;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OnlineVetAppointmentProvider implements VetAppointmentProvider {
	@Override
	public void bookAppointment(Vet vet, LocalDateTime dateTime) {
	}
}
