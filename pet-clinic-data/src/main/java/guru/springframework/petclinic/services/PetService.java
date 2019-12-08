package guru.springframework.petclinic.services;

import java.util.Set;

import guru.springframework.petclinic.model.Pet;

public interface PetService
{
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
