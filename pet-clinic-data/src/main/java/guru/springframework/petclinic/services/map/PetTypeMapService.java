package guru.springframework.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService
{
    @Override
    public Set<PetType> findAll()
    {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id)
    {
        return super.findByID(id);
    }

    @Override
    public PetType save(PetType object)
    {
        return super.save(object);
    }

    @Override
    public void delete(PetType object)
    {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
}
