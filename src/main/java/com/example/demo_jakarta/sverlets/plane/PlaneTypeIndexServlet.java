package com.example.demo_jakarta.sverlets.plane;


import com.example.demo_jakarta.entities.PlaneType;
import com.example.demo_jakarta.services.PlaneTypeService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/planeType")
public class PlaneTypeIndexServlet extends HttpServlet {

    @Inject
    private PlaneTypeService planeTypeService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PlaneType> planeTypeList = planeTypeService.getAllPlaneTypes();
        request.setAttribute("planeTypeList", planeTypeList);
        request.getRequestDispatcher("/WEB-INF/page/planeType/planeTypeIndex.jsp").forward(request, response);
    }
}
