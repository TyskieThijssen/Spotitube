package oose.dea.controllers;

import oose.dea.domain.Playlist;
import oose.dea.model.PlaylistModel;

import javax.inject.Inject;
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
@WebServlet("/showPlaylistsByOwner")
public class ShowPlaylistsByOwnerController extends HttpServlet{
    @Inject
    private PlaylistModel playlistModel;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String owner = request.getParameter("owner");
        List<Playlist> playlists = playlistModel.findPlaylistsByOwner(owner);

        request.setAttribute("playlistByOwner", playlists);
        request.setAttribute("owner", owner);
        request.getRequestDispatcher("view/ShowPlaylistByOwnerView.jsp").forward(request, response);
    }
}
