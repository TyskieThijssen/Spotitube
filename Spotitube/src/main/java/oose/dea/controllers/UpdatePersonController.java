package oose.dea.controllers;

import oose.dea.model.PersonModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tyskie on 22-3-2017.
 */
@WebServlet("/updatePerson")
public class UpdatePersonController extends HttpServlet {
    private PersonModel personModel = new PersonModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/UpdatePersonView.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String oldName = request.getParameter("naamPersoon");
        personModel.updatePerson(name, age, oldName);
        response.sendRedirect("showPersons");
    }
}
