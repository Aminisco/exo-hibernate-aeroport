package com.example.demo_jakarta.services.Impl;

import com.example.demo_jakarta.entities.PlaneType;
import com.example.demo_jakarta.repositories.PlaneTypeRepository;
import com.example.demo_jakarta.services.PlaneTypeService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneTypeServiceImpl implements PlaneTypeService, Serializable {

    @Inject
    private PlaneTypeRepository planeTypeRepository;

    @Override
    public List<PlaneType> getAllPlaneTypes() {
        return planeTypeRepository.findAll();
    }
}
