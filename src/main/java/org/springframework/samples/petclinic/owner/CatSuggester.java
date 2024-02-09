package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("cats")
@Component
public class CatSuggester implements PetSuggester {

	@Override
	public Pet suggest(Owner owner) {
		return null;
	}

}
