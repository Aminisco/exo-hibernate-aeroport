package com.example.demo_jakarta.services.Impl;

import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.repositories.PlaneRepository;
import com.example.demo_jakarta.services.PlaneService;
import jakarta.inject.Inject;

import java.util.List;

public class PlaneServiceImpl implements PlaneService {

    @Inject
    private PlaneRepository planeRepository;

    @Override
    public List<Plane> getAll() {
        return planeRepository.findAll();
    }
}
