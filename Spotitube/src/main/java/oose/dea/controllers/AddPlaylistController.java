package oose.dea.controllers;

import oose.dea.domain.Availability;
import oose.dea.model.PlaylistModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tyskie on 24-3-2017.
 */
@WebServlet("/addPlaylist")
public class AddPlaylistController extends HttpServlet {
    private PlaylistModel playlistModel = new PlaylistModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/AddPlaylistView.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String owner = request.getParameter("owner");
        String name = request.getParameter("name");
        playlistModel.addPlaylist(owner, name);
        response.sendRedirect("playlists");
    }
}
