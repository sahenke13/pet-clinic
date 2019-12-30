package guru.springframework.petclinic.model;

import java.util.Set;

public class Owner extends Person
{
    private String Address;
    private String City;
    private String telephone;
    private Set<Pet> pets;

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }

    public String getCity()
    {
        return City;
    }

    public void setCity(String city)
    {
        City = city;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public Set<Pet> getPets()
    {
        return pets;
    }

    public void setPets(Set<Pet> pets)
    {
        this.pets = pets;
    }
}
