package com.example.demo_jakarta.repositories.Impl;

import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.repositories.PlaneRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PlaneRepositoryImpl extends BaseRepositoryImpl<Plane, Long> implements PlaneRepository, Serializable {

    public PlaneRepositoryImpl() {
        super(Plane.class);
    }
}
