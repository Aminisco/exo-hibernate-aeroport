package com.example.demo_jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Vols extends BaseEntity<Long> {

    @Column
    private String destination;

    @Column(nullable = false)
    private int volume;
}
