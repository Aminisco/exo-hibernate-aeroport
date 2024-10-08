package com.example.demo_jakarta.services;

import com.example.demo_jakarta.entities.Pilote;
import com.example.demo_jakarta.entities.PilotePlaneType;
import com.example.demo_jakarta.entities.Plane;

import java.util.List;

public interface PilotePlaneTypeService {

    public void ajouterNbHeures(Plane plane,Pilote pilote, int nbHeures);
    public void supprimerNbHeures(PilotePlaneType pilotePlaneType, Plane plane,int nbHeures);
    List<PilotePlaneType> getAll();
}
