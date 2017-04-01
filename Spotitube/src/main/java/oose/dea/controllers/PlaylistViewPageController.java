package oose.dea.controllers;

import oose.dea.domain.Playlist;
import oose.dea.model.PlaylistModel;

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
@WebServlet("/playlists")
public class PlaylistViewPageController extends HttpServlet {
    private PlaylistModel playlistModel = new PlaylistModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Playlist> playlists = playlistModel.findAll();
        request.setAttribute("playlist", playlists);
        request.getRequestDispatcher("view/ShowAllPlaylistView.jsp").forward(request, response);
    }
}
