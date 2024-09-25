package com.example.demo_jakarta.services.Impl;


import com.example.demo_jakarta.entities.Pilote;
import com.example.demo_jakarta.entities.PilotePlaneType;
import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.repositories.PilotePlaneTypeRepository;
import com.example.demo_jakarta.services.PilotePlaneTypeService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;


@SessionScoped
public class PilotePlaneTypeServiceImpl implements PilotePlaneTypeService, Serializable {

    @Inject
    private PilotePlaneTypeRepository pilotePlaneTypeRepository;


    public void ajouterNbHeures(Plane plane,Pilote pilote, int nbHeures) {
        PilotePlaneType.PilotePlaneTypeId id = new PilotePlaneType.PilotePlaneTypeId(pilote.getId(), plane.getId());
        PilotePlaneType pilotePlaneType = pilotePlaneTypeRepository.findById(id).orElseThrow();
        pilotePlaneType.setFlyCount(pilotePlaneType.getFlyCount() + nbHeures);
        pilotePlaneTypeRepository.save(pilotePlaneType);
        plane.setFlycount(plane.getFlycount() + nbHeures);
    }

    @Override
    public void supprimerNbHeures(PilotePlaneType pilotePlaneType, Plane plane,int nbHeures) {
        plane.setFlycount(plane.getFlycount() - nbHeures);
        pilotePlaneType.setFlyCount(pilotePlaneType.getFlyCount() - nbHeures);
    }

    @Override
    public List<PilotePlaneType> getAll() {
        return pilotePlaneTypeRepository.findAll();
    }
}
