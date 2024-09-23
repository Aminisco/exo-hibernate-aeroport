package com.example.demo_jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Pilote extends Person {

    @Column(nullable = false, length = 50)
    private String plateNumber;

    public Pilote(){}

    public Pilote(String firstName, String lastName, String phoneNumber, Address address, String plateNumber) {
        super(firstName, lastName, phoneNumber, address);
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return super .toString() +"Pilote{" +
                "plateNumber='" + plateNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pilote pilote = (Pilote) o;
        return Objects.equals(plateNumber, pilote.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plateNumber);
    }
}
