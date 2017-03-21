package oose.dea.service;

import oose.dea.data.TrackDAOImpl;
import oose.dea.domain.Track;

import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
public class TrackService {
    private TrackDAOImpl trackDAOImpl = new TrackDAOImpl();

    public List<Track> findAll() {
        List<Track> tracks = trackDAOImpl.findAll();
        return tracks;
    }
}
