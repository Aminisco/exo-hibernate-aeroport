package com.example.demo_jakarta.services;

import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.entities.PlaneType;

import java.util.List;

public interface PlaneService {

    public List<Plane> getAll();

}
