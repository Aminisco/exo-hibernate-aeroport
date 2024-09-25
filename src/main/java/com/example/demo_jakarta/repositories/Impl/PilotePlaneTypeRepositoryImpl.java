package com.example.demo_jakarta.repositories.Impl;

import com.example.demo_jakarta.entities.PilotePlaneType;
import com.example.demo_jakarta.repositories.PilotePlaneTypeRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PilotePlaneTypeRepositoryImpl extends BaseRepositoryImpl<PilotePlaneType, PilotePlaneType.PilotePlaneTypeId> implements PilotePlaneTypeRepository, Serializable {

    public PilotePlaneTypeRepositoryImpl() {
        super(PilotePlaneType.class);
    }

}
