package com.example.demo_jakarta.utilitaires;


import com.example.demo_jakarta.entities.*;
import com.example.demo_jakarta.repositories.Impl.PilotePlaneTypeRepositoryImpl;
import com.example.demo_jakarta.repositories.Impl.PiloteRepositoryImpl;
import com.example.demo_jakarta.repositories.Impl.PlaneRepositoryImpl;
import com.example.demo_jakarta.repositories.Impl.PlaneTypeRepositoryImpl;
import com.example.demo_jakarta.repositories.PilotePlaneTypeRepository;
import com.example.demo_jakarta.repositories.PiloteRepository;
import com.example.demo_jakarta.repositories.PlaneRepository;
import com.example.demo_jakarta.repositories.PlaneTypeRepository;
import com.example.demo_jakarta.services.PilotePlaneTypeService;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DataInitializer implements ServletContextListener {

    private PlaneRepository planeRepository;
    private PlaneTypeRepository planeTypeRepository;
    private PiloteRepository piloteRepository;
    private PilotePlaneTypeRepository pilotePlaneTypeRepository;
    private PilotePlaneTypeService pilotePlaneTypeService;

    public DataInitializer() {
        this.planeRepository = new PlaneRepositoryImpl();
        this.planeTypeRepository = new PlaneTypeRepositoryImpl();
        this.piloteRepository = new PiloteRepositoryImpl();
        this.pilotePlaneTypeRepository = new PilotePlaneTypeRepositoryImpl();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //region plane
        PlaneType type1 = new PlaneType(
                "Boing",
                "German plane",
                500.78,
                59
        );

        PlaneType type2 = new PlaneType(
                "Chasse",
                "Armée de l'air",
                2987,
                2
        );


        Plane plane1 = new Plane(
                "123",
                5,
                null,
                type2
        );

        Plane plane2 = new Plane(
                "345",
                6,
                null,
                type1
        );

        plane1 = planeRepository.save(plane1);
        plane2 = planeRepository.save(plane2);
        //endregion

        Address adresse1 = new Address("Rue de la Loi", "Bruxelles", "Belgium");
        Pilote pilote1 = new Pilote("Messi", "Lionel", "0426897452", adresse1, "45JHOI85");
        pilote1 = piloteRepository.save(pilote1);


        PilotePlaneType pilotePlaneType1 = new PilotePlaneType(0, pilote1, plane2.getPlaneType());
        pilotePlaneType1 = pilotePlaneTypeRepository.save(pilotePlaneType1);

    }
}
