package oose.dea.model;

import oose.dea.domain.Track;
import oose.dea.service.TrackService;

import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
public class TrackModel {
    private TrackService trackService = new TrackService();

    public List<Track> findAll() {
        List<Track> tracks = trackService.findAll();
        return tracks;
    }
}
