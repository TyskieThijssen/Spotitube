package oose.dea.controllers;

import oose.dea.model.PlaylistModel;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tyskie on 24-3-2017.
 */
@WebServlet("/updatePlaylist")
public class UpdatePlaylistController extends HttpServlet {
    @Inject
    private PlaylistModel playlistModel;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String owner = request.getParameter("owner");
        String name = request.getParameter("name");
        request.setAttribute("owner", owner);
        request.setAttribute("name", name);
        request.getRequestDispatcher("view/UpdatePlaylistView.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String owner = request.getParameter("owner");
        String name = request.getParameter("name");
        String newName = request.getParameter("newName");
        playlistModel.updatePlaylist(owner, name, newName);
        response.sendRedirect("playlists");
    }
}
