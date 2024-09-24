package com.example.demo_jakarta.services.Impl;

import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.entities.PlaneType;
import com.example.demo_jakarta.repositories.PlaneRepository;
import com.example.demo_jakarta.services.PlaneService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneServiceImpl implements PlaneService, Serializable {

    @Inject
    private PlaneRepository planeRepository;


    @Override
    public List<Plane> getAll() {
        return planeRepository.findAll();
    }

}
