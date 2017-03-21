package oose.dea.data;

import oose.dea.domain.Track;

import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
public interface TrackDAO {
    List<Track> findAll();
}
