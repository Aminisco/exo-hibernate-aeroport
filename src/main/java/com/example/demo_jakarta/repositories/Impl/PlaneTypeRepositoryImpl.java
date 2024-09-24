package com.example.demo_jakarta.repositories.Impl;

import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.entities.PlaneType;
import com.example.demo_jakarta.repositories.PlaneRepository;
import com.example.demo_jakarta.repositories.PlaneTypeRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PlaneTypeRepositoryImpl extends BaseRepositoryImpl<PlaneType, Long> implements PlaneTypeRepository, Serializable {


    public PlaneTypeRepositoryImpl() {
        super(PlaneType.class);
    }
}
