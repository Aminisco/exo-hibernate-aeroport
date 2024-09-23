package com.example.demo_jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Maintenance extends BaseEntity<Long> {

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate date;

    @Column()
    @Range(min = 0)
    private int duration;

    @ManyToOne(fetch = FetchType.EAGER)
    private Plane plane;

    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanic verificateur;

    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanic reparator;

    public Maintenance() {}

    public Maintenance(String description, LocalDate date, int duration) {
        this.description = description;
        this.date = date;
        this.duration = duration;
    }

    public Maintenance(String description, LocalDate date, int duration, Plane plane, Mechanic verificateur, Mechanic reparator) {
        this(description, date, duration);
        this.plane = plane;
        this.verificateur = verificateur;
        this.reparator = reparator;
    }

    //region GET SET ToSTRING Equals HashCode
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Range(min = 0)
    public int getDuration() {
        return duration;
    }

    public void setDuration(@Range(min = 0) int duration) {
        this.duration = duration;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Mechanic getVerificateur() {
        return verificateur;
    }

    public void setVerificateur(Mechanic verificateur) {
        this.verificateur = verificateur;
    }

    public Mechanic getReparator() {
        return reparator;
    }

    public void setReparator(Mechanic reparator) {
        this.reparator = reparator;
    }

    @Override
    public String toString() {
        return super .toString() + "Maintenance{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", plane=" + plane +
                ", verificateur=" + verificateur +
                ", reparator=" + reparator +
                '}';
    }



    //endregion
}
