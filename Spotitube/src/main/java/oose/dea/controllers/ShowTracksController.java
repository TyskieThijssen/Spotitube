package oose.dea.controllers;

import oose.dea.domain.Person;
import oose.dea.domain.Track;
import oose.dea.model.PersonModel;
import oose.dea.model.TrackModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
@WebServlet("/showTracks")
public class ShowTracksController extends HttpServlet {
    private TrackModel trackModel = new TrackModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Track> tracks = trackModel.findAll();
        request.setAttribute("tracks", tracks);
        request.getRequestDispatcher("view/ShowTracksView.jsp").forward(request, response);
    }
}
