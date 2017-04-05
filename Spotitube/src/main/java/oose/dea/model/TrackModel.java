package oose.dea.model;

import oose.dea.domain.Track;
import oose.dea.service.TrackService;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
@Dependent
public class TrackModel {
    @Inject
    private TrackService trackService;

    public List<Track> findAll() {
        List<Track> tracks = trackService.findAll();
        return tracks;
    }

    public List<Track> searchTrackByName(String zoekTerm) {
        return trackService.searchTrackByName(zoekTerm);
    }
}
