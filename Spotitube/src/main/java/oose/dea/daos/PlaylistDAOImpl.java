package oose.dea.daos;

import oose.dea.database.DatabaseConnection;
import oose.dea.domain.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyskie on 24-3-2017.
 */
public class PlaylistDAOImpl implements PlaylistDAO {
    DatabaseConnection connection = new DatabaseConnection();
    Connection conn = connection.getConnection();

    PreparedStatement preparedStatement;
    Statement stmt;
    String query;

    @Override
    public List<Playlist> findAll() {
        List<Playlist> playlists = new ArrayList<Playlist>();
        try{
            stmt = conn.createStatement();
            query = "SELECT * FROM Playlist";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String owner = rs.getString("owner");
                String name = rs.getString("name");
                playlists.add(new Playlist(owner, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return playlists;
    }

    @Override
    public void deletePlaylist(String owner, String name) {
        try{
            query = "DELETE FROM Playlist WHERE owner = ? AND name = ?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, owner);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Playlist> findPlaylistByOwner(String owner) {
        List<Playlist> playlists = new ArrayList<Playlist>();
        try {
            query = "SELECT * FROM Playlist WHERE owner = ?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, owner);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                playlists.add(new Playlist(owner, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return playlists;
    }

    @Override
    public List<Track> findPlaylistByName(String owner, String name) {
        List<Track> tracks = new ArrayList<Track>();
        try{
            query = "SELECT t.title, t.performer, t.duration, t.album, t.playcount, t.publicationdate, t.description, a.availability FROM Track t INNER JOIN Availability a ON t.title = a.title WHERE t.title IN (select title from availability where owner = ? AND name = ?)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,owner);
            preparedStatement.setString(2, name);
            ResultSet rs = preparedStatement.executeQuery();
            TrackDAOImpl trackDAO = new TrackDAOImpl();
            while(rs.next()){
                tracks.addAll(trackDAO.getTracks(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tracks;
    }

    @Override
    public void addPlaylist(String owner, String name) {
        try{
            query = "INSERT INTO Playlist VALUES(?,?)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, owner);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePlaylist(String owner, String name, String newName) {
        try{
            query = "UPDATE Playlist SET name = ? WHERE owner = ? AND name = ?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, newName);
            preparedStatement.setString(2, owner);
            preparedStatement.setString(3, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addTrackToPlaylist(String owner, String name, String title) {
        try{
            query = "INSERT INTO Availability VALUES (?, ?, ?, 1)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, owner);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, title);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
