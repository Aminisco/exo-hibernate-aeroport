package com.example.demo_jakarta.entities;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.util.Objects;

@Entity
public class PilotePlaneType {

    @EmbeddedId
    private PilotePlaneTypeId id;

    @Column(nullable = false)
    @Range(min = 0)
    private int flyCount;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @MapsId("pilotId")
    private Pilote pilote;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @MapsId("planeTypeId")
    private PlaneType planeType;

    public PilotePlaneType() {}

    public PilotePlaneType(int flyCount, Pilote pilote, PlaneType planeType) {
        this();
        this.flyCount = flyCount;
        this.pilote = pilote;
        this.planeType = planeType;
        this.id = new PilotePlaneTypeId(pilote.getId(), planeType.getId());
    }

    @Embeddable
    public static class PilotePlaneTypeId {
        private Long pilotId;
        private Long planeTypeId;

        public PilotePlaneTypeId() {}

        public PilotePlaneTypeId(Long pilotId, Long planeTypeId) {
            this.pilotId = pilotId;
            this.planeTypeId = planeTypeId;
        }

        public Long getPilotId() {
            return pilotId;
        }

        public void setPilotId(Long pilotId) {
            this.pilotId = pilotId;
        }

        public Long getPlaneTypeId() {
            return planeTypeId;
        }

        public void setPlaneTypeId(Long planeTypeId) {
            this.planeTypeId = planeTypeId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PilotePlaneTypeId that = (PilotePlaneTypeId) o;
            return Objects.equals(pilotId, that.pilotId) && Objects.equals(planeTypeId, that.planeTypeId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pilotId, planeTypeId);
        }
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

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
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
