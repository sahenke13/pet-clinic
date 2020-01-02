package guru.springframework.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "owners")
public class Owner extends Person
{
    @Column(name = "address")
    private String Address;

    @Column(name = "city")
    private String City;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany( cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

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
