package oose.dea.controllers;

import oose.dea.model.PersonModel;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Thijs on 21-3-2017.
 */
@WebServlet("/handlePersons")
public class HandlePersonController extends HttpServlet {
    private PersonModel personModel = new PersonModel();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("update") != null){
            String oldName = request.getParameter("naamPersoon");
            response.sendRedirect("updatePerson");
            request.setAttribute("oldName", oldName);
        } else if(request.getParameter("verwijderen") != null){
            String name = request.getParameter("naamPersoon");
            personModel.deletePerson(name);
            response.sendRedirect("showPersons");
        }
    }
}