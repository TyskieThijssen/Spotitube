package oose.dea.controllers;

import oose.dea.model.PlaylistModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tyskie on 29-3-2017.
 */
@WebServlet("/addTrackToPlaylist")
public class AddTrackToPlaylistController extends HttpServlet {
    private PlaylistModel playlistModel = new PlaylistModel();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String owner = request.getParameter("owner");
        String name = request.getParameter("name");
        String title = request.getParameter("title");
        playlistModel.addTrackToPlaylist(owner, name, title);
        request.setAttribute("owner", owner);
        request.setAttribute("name", name);
        response.sendRedirect("playlists");
    }
}
