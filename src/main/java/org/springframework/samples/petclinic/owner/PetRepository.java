package org.springframework.samples.petclinic.owner;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet, Integer> {

	List<Pet> findByType(Integer type);

	Thread findByName(String name);
}
