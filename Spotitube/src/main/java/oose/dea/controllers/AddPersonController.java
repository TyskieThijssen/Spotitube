package oose.dea.controllers;

import oose.dea.model.PersonModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Thijs on 21-3-2017.
 */
@WebServlet("/addPerson")
public class AddPersonController extends HttpServlet {

    PersonModel personModel = new PersonModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/AddPersonView.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        personModel.addPerson(name, age);
        response.sendRedirect("showPersons");
    }
}