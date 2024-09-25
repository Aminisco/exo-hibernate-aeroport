package com.example.demo_jakarta.repositories.Impl;

import com.example.demo_jakarta.entities.Pilote;
import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.repositories.BaseRepository;
import com.example.demo_jakarta.repositories.PiloteRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PiloteRepositoryImpl extends BaseRepositoryImpl<Pilote, Long> implements PiloteRepository, Serializable {

    public PiloteRepositoryImpl() {
        super(Pilote.class);
    }


}
