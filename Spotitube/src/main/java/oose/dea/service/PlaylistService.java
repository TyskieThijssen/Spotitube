package oose.dea.service;

import oose.dea.daos.PlaylistDAOImpl;
import oose.dea.domain.Playlist;
import oose.dea.domain.Track;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Thijs on 18-3-2017.
 */
@Dependent
public class PlaylistService {
    @Inject
    private PlaylistDAOImpl playlistDAOImpl;

    public List<Playlist> findAll() {
        return playlistDAOImpl.findAll();
    }

    public void deletePlaylist(String owner, String name) {
        playlistDAOImpl.deletePlaylist(owner, name);
    }

    public List<Playlist> findPlaylistsByOwner(String owner) {
        return playlistDAOImpl.findPlaylistByOwner(owner);
    }

    public List<Track> findPlaylistByName(String owner, String name) {
        return playlistDAOImpl.findPlaylistByName(owner, name);
    }

    public void addPlaylist(String owner, String name) {
        playlistDAOImpl.addPlaylist(owner, name);
    }

    public void updatePlaylist(String owner, String name, String newName) {
        playlistDAOImpl.updatePlaylist(owner, name, newName);
    }

    public void addTrackToPlaylist(String owner, String name, String title) {
        playlistDAOImpl.addTrackToPlaylist(owner, name, title);
    }

    public void setPlaylistDAOImpl(PlaylistDAOImpl playlistDAOImpl){
        this.playlistDAOImpl = playlistDAOImpl;
    }
}
