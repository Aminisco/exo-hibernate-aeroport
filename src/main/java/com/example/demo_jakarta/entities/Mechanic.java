package com.example.demo_jakarta.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Mechanic extends Person {

    public Mechanic(){}

    public Mechanic(String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber, address);
        this.habilitation = new HashSet<>();
    }

    @ManyToMany
    private Set<PlaneType> habilitation;

    public void addHabilitation(PlaneType planeType) {
        this.habilitation.add(planeType);
    }

    public void removeHabilitation(PlaneType planeType) {
        this.habilitation.remove(planeType);
    }

    @Override
    public String toString() {
        return super.toString() +  "Mechanic{" +
                "habilitation=" + habilitation +
                '}';
    }
}
