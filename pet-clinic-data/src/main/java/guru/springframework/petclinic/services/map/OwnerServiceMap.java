package guru.springframework.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Owner;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.PetService;
import guru.springframework.petclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService
{
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService)
    {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll()
    {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id)
    {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object)
    {
        if(object != null) {
            if(object.getPets() != null){
                object.getPets().forEach(pet-> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());

                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object)
    {
         this.delete(object);
    }

    @Override
    public void deleteById(Long id)
    {
        this.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName)
    {
        return null;
    }
}
