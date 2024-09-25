package com.example.demo_jakarta.sverlets.plane;


import com.example.demo_jakarta.entities.Pilote;
import com.example.demo_jakarta.services.PiloteService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/pilote")
public class PiloteIndexServlet extends HttpServlet {

    @Inject
    private PiloteService piloteService;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Pilote> piloteList = piloteService.getAllPilote();
        request.setAttribute("piloteList", piloteList);
        request.getRequestDispatcher("WEB-INF/page/pilote/piloteIndex.jsp").forward(request, response);
    }
}
