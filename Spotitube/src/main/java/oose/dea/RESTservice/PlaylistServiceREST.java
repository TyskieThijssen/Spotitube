package oose.dea.RESTservice;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import oose.dea.daos.PlaylistDAOImpl;
import oose.dea.domain.Song;
import oose.dea.domain.Track;
import oose.dea.domain.Video;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tyskie on 4/4/17.
 */
@Path("/rest/playlist")
public class PlaylistServiceREST {
    @GET
    @Produces("application/json")
    @Path("/{owner}/{name}")
    public Response getPlaylistInformation(@PathParam("owner") String owner, @PathParam("name") String name){
        PlaylistDAOImpl playlistDAO = new PlaylistDAOImpl();
        List<Track> tracks = playlistDAO.findPlaylistByName(owner, name);
        List<Song> songs = new ArrayList<Song>();
        List<Video> videos = new ArrayList<Video>();

        for (Track track:tracks) {
            if(track instanceof Song){
                songs.add((Song)track);
            } else {
                videos.add((Video)track);
            }
        }

        JSONObject playlistInformation = new JSONObject();
        playlistInformation.put("owner", owner);
        playlistInformation.put("name", name);

        JSONArray trackArray = new JSONArray();

        for (Song song:songs) {
            JSONObject trackInformation = getSongInformation(song);
            trackArray.add(trackInformation);
        }

        for (Video video:videos) {
            JSONObject trackInformation = getVideoInformation(video);
            trackArray.add(trackInformation);
        }

        playlistInformation.put("tracks", trackArray);

        return Response.status(200).entity(playlistInformation).build();
    }

    public JSONObject getVideoInformation(Video video) {
        JSONObject trackInformation = new JSONObject();
        String performer = video.getPerformer();
        String title = video.getTitle();
        Time duration = video.getDuration();
        int playcount = video.getPlayCount();
        String publicationDate = video.getPublicationDate();
        String description = video.getDescription();

        trackInformation.put("performer", performer);
        trackInformation.put("title", title);
        trackInformation.put("duration", duration);
        trackInformation.put("playcount", playcount);
        trackInformation.put("publicationDate", publicationDate);
        trackInformation.put("description", description);
        return trackInformation;
    }

    public JSONObject getSongInformation(Song song) {
        JSONObject trackInformation = new JSONObject();
        String performer = song.getPerformer();
        String title = song.getTitle();
        Time duration = song.getDuration();
        String album = song.getAlbum();

        trackInformation.put("performer", performer);
        trackInformation.put("title", title);
        trackInformation.put("duration", duration);
        trackInformation.put("album", album);
        return trackInformation;
    }
}
