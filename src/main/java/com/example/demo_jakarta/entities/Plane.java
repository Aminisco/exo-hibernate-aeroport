package com.example.demo_jakarta.entities;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.util.Objects;

@Entity
public class Plane extends BaseEntity<Long> {

    @Column(unique = true,nullable = false, length = 50)
    private String immatriculation;

    @Column(nullable = false)
    @Range(min = 0)
    private int flycount;

    @ManyToOne(fetch = FetchType.LAZY)
    private Owner owner;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private PlaneType planeType;

    public Plane(){}

    public Plane(String immatriculation, int flycount) {
        this();
        this.immatriculation = immatriculation;
        this.flycount = flycount;
    }

    public Plane(String immatriculation, int flycount, Owner owner, PlaneType planeType) {
        this(immatriculation, flycount);
        this.owner = owner;
        this.planeType = planeType;
    }

    //region GET SET ToSTRING Equals HashCode
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getFlycount() {
        return flycount;
    }

    public void setFlycount(int flycount) {
        this.flycount = flycount;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }
    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    @Override
    public String toString() {
        return super .toString() + "Plane{" +
                "immatriculation='" + immatriculation + '\'' +
                ", flycount=" + flycount +
                ", owner=" + owner +
                ", planeType=" + planeType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return flycount == plane.flycount && Objects.equals(immatriculation, plane.immatriculation) && Objects.equals(owner, plane.owner) && Objects.equals(planeType, plane.planeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), immatriculation, flycount, owner, planeType);
    }

    //endregion
}
