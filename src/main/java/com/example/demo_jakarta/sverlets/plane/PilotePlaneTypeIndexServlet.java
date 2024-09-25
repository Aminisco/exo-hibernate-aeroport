package com.example.demo_jakarta.sverlets.plane;


import com.example.demo_jakarta.entities.PilotePlaneType;
import com.example.demo_jakarta.services.PilotePlaneTypeService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/PilotePlaneType")
public class PilotePlaneTypeIndexServlet extends HttpServlet {

    @Inject
    private PilotePlaneTypeService pilotePlaneTypeService;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<PilotePlaneType> vols = pilotePlaneTypeService.getAll();
       request.setAttribute("vols", vols);
       request.getRequestDispatcher("/WEB-INF/page/pilotePlaneType/pilotePlaneTypeIndex.jsp").forward(request, response);
   }

}
