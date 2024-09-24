package com.example.demo_jakarta.sverlets.plane;

import com.example.demo_jakarta.entities.Plane;
import com.example.demo_jakarta.entities.PlaneType;
import com.example.demo_jakarta.services.PlaneService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/plane")
public class PlaneIndexServlet extends HttpServlet {

    @Inject
    private PlaneService planeService;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Plane> planes = planeService.getAll();
        request.setAttribute("planes", planes);
        request.getRequestDispatcher("/WEB-INF/page/plane/planeIndex.jsp").forward(request, response);
    }
}
