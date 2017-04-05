package oose.dea.model;

import oose.dea.domain.Availability;
import oose.dea.domain.Playlist;
import oose.dea.domain.Track;
import oose.dea.service.PlaylistService;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Thijs on 18-3-2017.
 */
@Dependent
public class PlaylistModel {
    @Inject
    private PlaylistService playlistService;

    public List<Playlist> findAll() {
        return playlistService.findAll();
    }

    public void deletePlaylist(String owner, String name) {
        playlistService.deletePlaylist(owner, name);
    }

    public List<Playlist> findPlaylistsByOwner(String owner) {
        return playlistService.findPlaylistsByOwner(owner);
    }

    public List<Track> findPlaylistByName(String owner, String name) {
        return playlistService.findPlaylistByName(owner, name);
    }

    public void addPlaylist(String owner, String name) {
        playlistService.addPlaylist(owner, name);
    }

    public void updatePlaylist(String owner, String name, String newName) {
        playlistService.updatePlaylist(owner, name, newName);
    }

    public void addTrackToPlaylist(String owner, String name, String title) {
        playlistService.addTrackToPlaylist(owner, name, title);
    }
}
