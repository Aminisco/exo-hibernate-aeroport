package com.example.demo_jakarta.services.Impl;

import com.example.demo_jakarta.entities.Pilote;
import com.example.demo_jakarta.repositories.PiloteRepository;
import com.example.demo_jakarta.services.PiloteService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PiloteServiceImpl implements PiloteService, Serializable {

    @Inject
    private PiloteRepository piloteRepository;

    @Override
    public List<Pilote> getAllPilote() {
        return piloteRepository.findAll();
    }

}
