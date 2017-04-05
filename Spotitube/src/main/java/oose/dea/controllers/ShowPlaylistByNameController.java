package oose.dea.controllers;

import oose.dea.domain.*;
import oose.dea.model.PlaylistModel;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyskie on 24-3-2017.
 */
@WebServlet("/showPlaylistByName")
public class ShowPlaylistByNameController extends HttpServlet {
    @Inject
    private PlaylistModel playlistModel;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String owner = request.getParameter("owner");
        String name = request.getParameter("name");
        List<Track> tracks = playlistModel.findPlaylistByName(owner, name);

        List<Song> songs = new ArrayList<Song>();
        List<Video> videos = new ArrayList<Video>();

        for (Track track:tracks) {
            if(track instanceof Song){
                songs.add((Song) track);
            } else {
                videos.add((Video) track);
            }
        }

        request.setAttribute("songs", songs);
        request.setAttribute("videos", videos);
        request.setAttribute("owner", owner);
        request.setAttribute("name", name);
        request.getRequestDispatcher("view/ShowPlaylistByNameView.jsp").forward(request, response);
    }
}
