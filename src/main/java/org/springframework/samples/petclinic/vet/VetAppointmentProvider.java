package org.springframework.samples.petclinic.vet;

import java.time.LocalDateTime;

public interface VetAppointmentProvider {

	void bookAppointment(Vet vet, LocalDateTime dateTime);

}
