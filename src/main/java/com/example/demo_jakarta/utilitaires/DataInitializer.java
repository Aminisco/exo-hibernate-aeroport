package com.example.demo_jakarta.utilitaires;


import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.entities.PlaneType;
import com.example.demo_jakarta.repositories.Impl.PlaneRepositoryImpl;
import com.example.demo_jakarta.repositories.Impl.PlaneTypeRepositoryImpl;
import com.example.demo_jakarta.repositories.PlaneRepository;
import com.example.demo_jakarta.repositories.PlaneTypeRepository;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DataInitializer implements ServletContextListener {

    private PlaneRepository planeRepository;

    private PlaneTypeRepository planeTypeRepository;

    public DataInitializer() {
        this.planeRepository = new PlaneRepositoryImpl();
        this.planeTypeRepository = new PlaneTypeRepositoryImpl();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

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

//        planeTypeRepository.save(type1);
//        planeTypeRepository.save(type2);

        planeRepository.save(plane1);
        planeRepository.save(plane2);


    }
}
