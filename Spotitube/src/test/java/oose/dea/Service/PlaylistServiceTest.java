package oose.dea.Service;

import oose.dea.daos.PlaylistDAOImpl;
import oose.dea.domain.Playlist;
import oose.dea.service.PlaylistService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doNothing;

/**
 * Created by tyskie on 4/6/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class PlaylistServiceTest {
    @Mock
    private PlaylistDAOImpl playlistDAO;

    private PlaylistService playlistService;
    private String owner;
    private String name;

    @Before
    public void setUp(){
        playlistService = new PlaylistService();
        playlistService.setPlaylistDAOImpl(playlistDAO);
        owner = "Thijs";
        name = "Nieuwe Playlist";
    }

    @Test
    public void testFindAll(){
        List<Playlist> expected = new ArrayList<Playlist>();
        expected.add(new Playlist(owner,name));

        Mockito.when(playlistDAO.findAll()).thenReturn(expected);
        List<Playlist> actual = playlistService.findAll();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeletePlaylist(){
        doNothing().when(playlistDAO).deletePlaylist(Mockito.any(String.class), Mockito.any(String.class));
        playlistService.deletePlaylist(owner, name);
    }

    @Test
    public void testFindPlaylistByOwner(){
        List<Playlist> expected = new ArrayList<Playlist>();
        expected.add(new Playlist(owner, name));

        Mockito.when(playlistDAO.findPlaylistByOwner(Mockito.anyString())).thenReturn(expected);
        List<Playlist> actual = playlistService.findPlaylistsByOwner(owner);

        Assert.assertEquals(expected, actual);
    }
}
