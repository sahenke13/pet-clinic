package guru.springframework.petclinic.services.map;

import java.util.Set;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService
{
    @Override
    public Set<Pet> findAll()
    {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id)
    {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet pet)
    {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet)
    {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
}
