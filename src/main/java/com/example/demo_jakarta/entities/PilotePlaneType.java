package com.example.demo_jakarta.entities;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

@Entity
public class PilotePlaneType {

    @EmbeddedId
    private PilotePlaneTypeId id;

    @Column(nullable = false)
    @Range(min = 0)
    private int flyCount;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("pilotId")
    private Pilote pilote;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("planeTypeId")
    private Plane planeType;

    public PilotePlaneType() {}

    public PilotePlaneType(PilotePlaneTypeId id, int flyCount, Pilote pilote, Plane planeType) {
        this();
        this.flyCount = flyCount;
        this.pilote = pilote;
        this.planeType = planeType;
    }

    @Embeddable
    private static class PilotePlaneTypeId {
        private Long pilotId;
        private Long planeTypeId;
    }

    public PilotePlaneTypeId getId() {
        return id;
    }

    @Range(min = 0)
    public int getFlyCount() {
        return flyCount;
    }

    public void setFlyCount(@Range(min = 0) int flyCount) {
        this.flyCount = flyCount;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Plane getPlaneType() {
        return planeType;
    }

    public void setPlaneType(Plane planeType) {
        this.planeType = planeType;
    }

    @Override
    public String toString() {
        return super.toString() + "PilotePlaneType{" +
                "id=" + id +
                ", flyCount=" + flyCount +
                ", pilote=" + pilote +
                ", planeType=" + planeType +
                '}';
    }


}
