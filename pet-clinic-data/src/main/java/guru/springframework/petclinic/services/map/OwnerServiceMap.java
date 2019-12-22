package guru.springframework.petclinic.services.map;

import java.util.Set;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>
{
    @Override
    public Set<Owner> findAll()
    {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id)
    {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object)
    {
        return super.save(object.getId(), object);
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
}
