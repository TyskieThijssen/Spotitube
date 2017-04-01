package oose.dea.controllers;

import oose.dea.model.PlaylistModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tyskie on 24-3-2017.
 */
@WebServlet("/deletePlaylist")
public class DeletePlaylistController extends HttpServlet {
    private PlaylistModel playlistModel = new PlaylistModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/ShowAllPlaylistView.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String owner = request.getParameter("owner");
        String name = request.getParameter("name");

        playlistModel.deletePlaylist(owner, name);

        response.sendRedirect("playlists");
    }
}
