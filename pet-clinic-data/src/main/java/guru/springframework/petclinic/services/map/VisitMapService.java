package guru.springframework.petclinic.services.map;

import java.util.HashSet;
import java.util.Set;

import guru.springframework.petclinic.model.Visit;
import guru.springframework.petclinic.repositories.VisitRepository;
import guru.springframework.petclinic.services.VisitService;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService
{

    private final VisitRepository visitRepository;

    public VisitMapService(VisitRepository visitRepository)
    {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll()
    {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id)
    {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit)
    {
        if(visit == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit visit)
    {
        super.delete(visit);
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
}
