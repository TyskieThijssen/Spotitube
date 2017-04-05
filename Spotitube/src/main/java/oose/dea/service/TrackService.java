package oose.dea.service;

import oose.dea.daos.TrackDAOImpl;
import oose.dea.domain.Track;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
@Dependent
public class TrackService {
    @Inject
    private TrackDAOImpl trackDAOImpl;

    public List<Track> findAll() {
        List<Track> tracks = trackDAOImpl.findAll();
        return tracks;
    }

    public List<Track> searchTrackByName(String zoekTerm) {
        return trackDAOImpl.searchTrackByName(zoekTerm);
    }
}
