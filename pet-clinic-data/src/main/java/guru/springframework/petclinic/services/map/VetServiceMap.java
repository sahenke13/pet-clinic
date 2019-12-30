package guru.springframework.petclinic.services.map;

import java.util.Set;


import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Specialty;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.SpecialtyService;
import guru.springframework.petclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService
{
    public VetServiceMap(SpecialtyService specialtyService)
    {
        this.specialtyService = specialtyService;
    }

    private final SpecialtyService specialtyService;


    @Override
    public Set<Vet> findAll()
    {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id)
    {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object)
    {
        if (object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public void delete(Vet vet)
    {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }


}
