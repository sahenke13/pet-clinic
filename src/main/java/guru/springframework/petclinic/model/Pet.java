package guru.springframework.petclinic.model;

import java.time.LocalDate;

public class Pet
{
    private PetType pettype;
    private Owner owner;
    private LocalDate birthdate;

    public PetType getPettype()
    {
        return pettype;
    }

    public void setPettype(PetType pettype)
    {
        this.pettype = pettype;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate)
    {
        this.birthdate = birthdate;
    }
}
