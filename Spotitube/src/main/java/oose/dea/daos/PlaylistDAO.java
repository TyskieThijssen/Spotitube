package oose.dea.daos;

import oose.dea.domain.Playlist;
import oose.dea.domain.Track;

import java.util.List;

/**
 * Created by Tyskie on 24-3-2017.
 */
public interface PlaylistDAO {
    List<Playlist> findAll();
    void deletePlaylist(String owner, String name);
    List<Playlist> findPlaylistByOwner(String owner);
    List<Track> findPlaylistByName(String owner, String name);
    void addPlaylist(String owner, String name);

    void updatePlaylist(String owner, String name, String newName);
    void addTrackToPlaylist(String owner, String name, String title);
}
