package oose.dea.controllers;

import oose.dea.model.PersonModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tyskie on 23-3-2017.
 */
@WebServlet("/deletePerson")
public class DeletePersonController extends HttpServlet {
    private PersonModel personModel = new PersonModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("naamPersoon");
        personModel.deletePerson(name);
        response.sendRedirect("showPersons");
    }
}
