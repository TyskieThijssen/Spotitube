package oose.dea;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Thijs on 18-3-2017.
 */
@WebServlet("/viewPersons")
public class PersonController extends HttpServlet {

    private PersonService personService = new PersonService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> persons = personService.findAll();
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("viewPersons.jsp").forward(request, response);
    }
}
