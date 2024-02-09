package org.springframework.samples.petclinic.owner;

import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public interface PetRepository extends CrudRepository<Pet, Integer> {

	List<Pet> findByType(Integer type);

	Map<Integer, Pet> findAllByBirthDate(LocalDate birthDate);

}
