package oose.dea.controllers;

import oose.dea.domain.Song;
import oose.dea.domain.Track;
import oose.dea.domain.Video;
import oose.dea.model.TrackModel;

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
@WebServlet("/searchTrack")
public class SearchTrackController extends HttpServlet {
    @Inject
    private TrackModel trackModel;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String zoekTerm = request.getParameter("zoekTerm");
        List<Track> tracks = trackModel.searchTrackByName(zoekTerm);
        List<Song> songs = new ArrayList<Song>();
        List<Video> videos = new ArrayList<Video>();
        for (Track track:tracks) {
            if(track instanceof Song){
                songs.add((Song) track);
            } else {
                videos.add((Video) track);
            }
        }
        String owner = request.getParameter("owner");
        String name = request.getParameter("name");
        request.setAttribute("owner", owner);
        request.setAttribute("name", name);
        request.setAttribute("songs", songs);
        request.setAttribute("videos", videos);
        request.getRequestDispatcher("view/ShowTracksView.jsp").forward(request, response);
    }
}
