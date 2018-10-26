package de.ninjacodes.sfgpetclinic.services;

import de.ninjacodes.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
